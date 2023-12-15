package org.jetbrains.bazel.languages.build

import com.intellij.execution.lineMarker.RunLineMarkerContributor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import org.jetbrains.bazel.assets.BazelPluginIcons
import org.jetbrains.bazel.config.isBazelProject
import org.jetbrains.bazel.languages.starlark.psi.StarlarkCallExpression
import org.jetbrains.kotlin.idea.completion.argList
import org.jetbrains.plugins.bsp.services.MagicMetaModelService
import org.jetbrains.plugins.bsp.ui.widgets.tool.window.actions.BuildTargetAction

class BuildFileRunLineMarkerContributor : RunLineMarkerContributor() {
  override fun getInfo(element: PsiElement): Info? =
    if (element.project.isBazelProject && element.isInBuildFile()) element.calculateLineMarkerInfo()
    else null

  private fun PsiElement.calculateLineMarkerInfo(): Info? = when(this) {
    is StarlarkCallExpression -> Info(BazelPluginIcons.bazel, arrayOf(BuildTargetAction("//..."))) { "Bazel actions" }
    else -> null
  }

  private fun StarlarkCallExpression.aa(project: Project) {
    val magicMetaModel = MagicMetaModelService.getInstance(project).value
    val allBuildTargets = magicMetaModel.getAllLoadedTargets().map { it.id } + magicMetaModel.getAllNotLoadedTargets().map { it.id }

  }

  private fun findReal
}