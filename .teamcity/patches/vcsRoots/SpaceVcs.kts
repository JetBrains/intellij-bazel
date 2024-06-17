package patches.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the vcsRoot with id = 'SpaceVcs'
accordingly, and delete the patch script.
*/
changeVcsRoot(RelativeId("SpaceVcs")) {
    val expected = GitVcsRoot({
        id("SpaceVcs")
        name = "intellij-bazel-space"
        url = "https://git.jetbrains.team/bazel/intellij-bazel.git"
        branch = "main"
        branchSpec = "+:refs/heads/*"
        authMethod = token {
            userName = "x-oauth-basic"
            tokenId = "tc_token_id:CID_ee3bac3e4aa54bdf48fee3b7b53cbc31:-1:5ea7fbfe-e4cb-4bee-ab88-8c33a815dfd1"
        }
    })

    check(this == expected) {
        "Unexpected VCS root settings"
    }

    (this as GitVcsRoot).apply {
        authMethod = password {
            userName = "x-oauth-basic"
            password = "credentialsJSON:4efcb75d-2f9b-47fd-a63b-fc2969a334f5"
        }
        param("tokenId", "tc_token_id:CID_ee3bac3e4aa54bdf48fee3b7b53cbc31:-1:465dcee7-3b16-45e0-b68e-46560cb44b9e")
    }

}
