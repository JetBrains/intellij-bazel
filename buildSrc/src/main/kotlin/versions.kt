// IntelliJ Platform Artifacts Repositories
// -> https://plugins.jetbrains.com/docs/intellij/intellij-artifacts.html
object Plugin {
  const val group = "org.jetbrains"
  const val name = "intellij-bazel"
  const val version = "2024.1.0-EAP"

// See https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html
// for insight into build numbers and IntelliJ Platform versions.
  const val sinceBuild = "241.14494.17"
  const val untilBuild = "241.*"
}

// Plugin Verifier integration -> https://github.com/JetBrains/gradle-intellij-plugin//plugin-verifier-dsl
// See https://jb.gg/intellij-platform-builds-list for available build versions.
const val pluginVerifierIdeVersions = "241.14494.17"

object Platform {
  const val type = "IC"
  const val version = "241.14494.17"
  const val snapshotVersion = "241.14494.17-EAP-SNAPSHOT"

  // Plugin Dependencies -> https://plugins.jetbrains.com/docs/intellij/plugin-dependencies.html
  // Example: platformPlugins =" com.intellij.java, com.jetbrains.php:203.4449.22"
  val plugins = listOf("com.intellij.java", "org.jetbrains.kotlin")
}

const val javaVersion = "17"
const val kotlinVersion = "1.9"

// Probe dependencies
const val scalaPluginVersion = "2024.1.3"
