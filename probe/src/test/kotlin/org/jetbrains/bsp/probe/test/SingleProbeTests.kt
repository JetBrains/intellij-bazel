package org.jetbrains.bsp.probe.test

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.virtuslab.ideprobe.ProbeDriver
import org.virtuslab.ideprobe.robot.RobotProbeDriver
import org.virtuslab.ideprobe.robot.RobotSyntax.SearchableOps
import scala.runtime.BoxedUnit

class SingleProbeTests {

  @Test
  fun `open fresh instance of bazel-bsp project and check imported targets`() {
    with(
      IdeProbeTestRunner(
        "https://github.com/JetBrains/bazel-bsp.git",
        "3.1.0",
      )
    ) {
      runIntellijAndOpenProject { probe, robot, intellij ->
        fun testTargetsTree(buildPanel: SearchableOps) {
          val loaded =
            buildPanel.findElement(Query.className("ActionButton", "myaction.key" to "widget.loaded.targets.tab.name"))
          loaded.click()
          val targetsTree = buildPanel.findElement(Query.className("Tree"))
          probe.screenshot("_bazel-bsp-build-panel")
          Assertions.assertEquals(8, targetsTree.fullTexts().size)
        }

        probe.screenshot("_bazel-bsp-on-open")
        val stripeButton = robot.findElement(Query.className("StripeButton", "text" to "Bazel"))
        probe.screenshot("_bazel-bsp-button-before-click")
        stripeButton.doClick()
        val buildPanel = robot.findElement(Query.className("BspToolWindowPanel"))
        probe.screenshot("_bazel-bsp-button-after-click")
        testTargetsTree(buildPanel)

        robot.assertNoProblems(probe)
        probe.screenshot("_bazel-bsp-project-before-closing")
        closeProject(probe)
        probe.screenshot("_bazel-bsp-before-reopen")
        openProject(intellij)
        probe.screenshot("_bazel-bsp-project-on-reopen")

        val newBuildPanel = robot.findElement(Query.className("BspToolWindowPanel"))
        val reload =
          newBuildPanel.findElement(Query.className("ActionButton", "myaction.key" to "reload.action.text"))
        probe.screenshot("_bazel-bsp-before-reload-click")
        reload.click()
        probe.await(emptyBackgroundTaskWithoutTimeouts {
          robot.findElement(Query.className("StripeButton", "text" to "Bazel"))
        })
        probe.screenshot("_bazel-bsp-after-reload-click")
        testTargetsTree(newBuildPanel)
        probe.screenshot("_bazel-bsp-before-end-of-test")
        BoxedUnit.UNIT
      }
    }
  }

  @Test
  fun `open fresh instance of bazel project and check build console output for errors`() {
    with(
      IdeProbeTestRunner(
        "https://github.com/bazelbuild/bazel.git", "7.0.2",
      )
    ) {
      runIntellijAndOpenProject { probe, robot, _ ->
        probe.screenshot("_bazel-on-open")
        robot.assertNoProblems(probe)
        probe.screenshot("_bazel-before-end-of-test")

        BoxedUnit.UNIT
      }
    }
  }

  private fun RobotProbeDriver.assertNoProblems(probe: ProbeDriver) {
    findElement(Query.className("StripeButton", "text" to "Problems")).doClick()
    val errors = findElement(Query.className("ContentTabLabel", "visible_text" to "Project Errors"))
    var problemsText = ""
    probe.tryUntilSuccessful {
      errors.fixture().click()
      val problemsTree = findElement(Query.className("ProblemsViewPanel"))
        .findElement(Query.className("Tree"))
      problemsText = problemsTree.fullText().split("\n").firstOrNull().orEmpty()
    }
    Assertions.assertEquals("No errors found by the IDE", problemsText)
  }
}
