package configurations

import jetbrains.buildServer.configs.kotlin.v10.toExtId
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.PullRequests
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.commitStatusPublisher
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.pullRequests
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script


open class BaseBuildType(
    name: String,
    vcsRoot: GitVcsRoot,
    steps: BuildSteps.() -> Unit,
    failureConditions: FailureConditions.() -> Unit = {},
    artifactRules: String = "",
    setupSteps: Boolean = false,
    requirements: (Requirements.() -> Unit)? = null
) : BuildType({
    this.name = name
    this.artifactRules = artifactRules

    failureConditions {
        executionTimeoutMin = 60
    }

    this.failureConditions(failureConditions)


    vcs {
        root(vcsRoot)
    }

    if (vcsRoot.name == "intellij-bazel-github" ) {
        id("GitHub$name".toExtId())
        if (requirements == null) {
            requirements {
                endsWith("cloud.amazon.agent-name-prefix", "Medium")
                equals("container.engine.osType", "linux")
            }
        } else {
            this.requirements(requirements)
        }
    } else {
        id("Space$name".toExtId())
        requirements {
            endsWith("cloud.amazon.agent-name-prefix", "-XLarge")
            equals("container.engine.osType", "linux")
        }
    }


    features {
        perfmon {
        }
        if (vcsRoot.name == "intellij-bazel-github") {
            commitStatusPublisher {
                publisher = github {
                    githubUrl = "https://api.github.com"
                    authType = personalToken {
                        token = "credentialsJSON:5bc345d4-e38f-4428-95e1-b6e4121aadf6"
                    }
                }
                param("github_oauth_user", "hb-man")
            }

            pullRequests {
                vcsRootExtId = "${vcsRoot.id}"
                provider = github {
                    authType = token {
                        token = "credentialsJSON:5bc345d4-e38f-4428-95e1-b6e4121aadf6"
                    }
                    filterAuthorRole = PullRequests.GitHubRoleFilter.EVERYBODY
                }
            }
        } else {
            commitStatusPublisher {
                vcsRootExtId = "${vcsRoot.id}"
                publisher = space {
                    authType = connection {
                        connectionId = "PROJECT_EXT_12"
                    }
                    displayName = "BazelTeamCityCloud"
                }
            }
        }
    }

    if (setupSteps) {
        steps {
            script {
                this.name = "Coursier"

                scriptContent = """
                    #!/bin/bash
                    set -euxo pipefail
                                        
                    #install coursier
                    curl -fL "https://github.com/coursier/coursier/releases/download/v2.1.5/cs-x86_64-pc-linux.gz" | gzip -d > cs 
                    sudo mv cs /usr/bin/cs
                    
                    sudo chmod +x "/usr/bin/cs"
            """.trimIndent()
            }
        }
    }
    this.steps(steps)
})


object GitHubVcs : GitVcsRoot({
    name = "intellij-bazel-github"
    url = "https://github.com/JetBrains/intellij-bazel.git"
    branch = "main"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "hb-man"
        password = "credentialsJSON:5bc345d4-e38f-4428-95e1-b6e4121aadf6"
    }
    param("oauthProviderId", "tc-cloud-github-connection")
    param("tokenType", "permanent")
})

object SpaceVcs : GitVcsRoot({
    name = "intellij-bazel-space"
    url = "https://git.jetbrains.team/bazel/intellij-bazel.git"
    branch = "main"
    branchSpec = "+:refs/heads/*"
    authMethod = token {
        userName = "x-oauth-basic"
        tokenId = "tc_token_id:CID_ee3bac3e4aa54bdf48fee3b7b53cbc31:-1:5ea7fbfe-e4cb-4bee-ab88-8c33a815dfd1"
    }
})