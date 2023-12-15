package org.jetbrains.bazel.config

import com.intellij.openapi.project.Project
import org.jetbrains.bazel.config.BazelPluginConstants.bazelBspBuildToolId
import org.jetbrains.plugins.bsp.config.buildToolId
import org.jetbrains.plugins.bsp.config.isBspProject

internal val Project.isBazelProject: Boolean
  get() = isBspProject && buildToolId == bazelBspBuildToolId