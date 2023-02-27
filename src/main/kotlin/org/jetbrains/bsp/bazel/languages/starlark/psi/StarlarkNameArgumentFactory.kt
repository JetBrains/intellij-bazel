package org.jetbrains.bsp.bazel.languages.starlark.psi

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFileFactory
import org.jetbrains.bsp.bazel.languages.starlark.StarlarkLanguage


object StarlarkNameArgumentFactory {
    fun createNameArgument(project: Project, name: String): StarlarkNameArgument {
        val text = "Rule(name = $name)"
        val file: StarlarkFile = createFile(project, text)
        return file.firstChild as StarlarkNameArgument
    }

    private fun createFile(project: Project, text: String): StarlarkFile {
        val name = "dummy.simple"
        return PsiFileFactory.getInstance(project).createFileFromText(name, StarlarkLanguage, text) as StarlarkFile
    }
}