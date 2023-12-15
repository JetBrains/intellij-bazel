package org.jetbrains.bazel.languages.build

import com.intellij.psi.PsiElement

internal fun PsiElement.isInBuildFile(): Boolean =
  containingFile.name.also { println("AAA $it") } == "BUILD"
