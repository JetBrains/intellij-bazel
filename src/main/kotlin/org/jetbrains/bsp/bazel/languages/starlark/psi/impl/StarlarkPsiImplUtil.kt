package org.jetbrains.bsp.bazel.languages.starlark.psi.impl

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import org.jetbrains.bsp.bazel.languages.starlark.psi.StarlarkNameArgumentFactory
import org.jetbrains.bsp.bazel.languages.starlark.psi.StarlarkNameArgument


fun getKey(element: StarlarkNameArgument): String? {
    val valueNode: ASTNode = element.node
    return if (valueNode != null) {
        valueNode.text
    } else {
        null
    }
}

fun getValue(element: StarlarkNameArgument): String? {
    val valueNode: ASTNode = element.node
    return if (valueNode != null) {
        valueNode.text
    } else {
        null
    }
}

fun getName(element: StarlarkNameArgument): String? {
    return getKey(element)
}

fun setName(element: StarlarkNameArgument?, newName: String?): PsiElement? {
    val keyNode: ASTNode? = element?.node
    if (keyNode != null && newName != null) {
        val nameArgument: StarlarkNameArgument = StarlarkNameArgumentFactory.createNameArgument(element.project, newName)
        val newKeyNode: ASTNode = nameArgument.firstChild.node
        element.node.replaceChild(keyNode, newKeyNode)
    }
    return element
}

fun getNameIdentifier(element: StarlarkNameArgument): PsiElement? {
    val keyNode: ASTNode = element.node
    return if (keyNode != null) keyNode.psi else null
}