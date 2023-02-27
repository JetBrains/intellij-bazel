package org.jetbrains.bsp.bazel.languages.starlark.refactoring

import com.intellij.patterns.PlatformPatterns
import com.intellij.patterns.PsiElementPattern
import com.intellij.patterns.PsiFilePattern
import com.intellij.patterns.StandardPatterns
import com.intellij.psi.*
import com.intellij.util.ProcessingContext
import org.jetbrains.bsp.bazel.languages.starlark.StarlarkLanguage
import org.jetbrains.bsp.bazel.languages.starlark.StarlarkTypes
import org.jetbrains.bsp.bazel.languages.starlark.psi.StarlarkOperand

class StarlarkPsiReferenceContributor: PsiReferenceContributor() {
//        override fun registerReferenceProviders(registrar: PsiReferenceRegistrar) {
//        registrar.registerReferenceProvider(
//            PlatformPatterns.psiElement(XmlTokenType.XML_DATA_CHARACTERS),
//            object : PsiReferenceProvider() {
//                override fun getReferencesByElement(
//                    element: PsiElement, context: ProcessingContext
//                ): Array<PsiReference> {
//                    val token = element as XmlToken
//                    val userData = token.getUserData(PsiReferenceData.PANDA_REFERENCES)
//                    if (userData != null && token.containingFile.modificationStamp == userData.modificationStamp) {
//                        return userData.psiReferences.toTypedArray()
//                    }
//                    val project = element.project
//                    val classRefName = token.text
//                    val psiClass: PsiClass = JavaPsiFacade.getInstance(project)
//                        .findClass(classRefName, GlobalSearchScope.projectScope(project))
//                        ?: return PsiReference.EMPTY_ARRAY
//
//                    val psiRef = PsiRef(
//                        token, TextRange(0, classRefName.length), psiClass
//                    )
//                    // 引用塞到缓存
//                    token.putUserData(
//                        PsiReferenceData.PANDA_REFERENCES,
//                        PsiReferenceData(token.containingFile.modificationStamp, arrayListOf(psiRef))
//                    )
//                    return arrayOf(psiRef)
//                }
//            })
//    }
    override fun registerReferenceProviders(registrar: PsiReferenceRegistrar) {
        registrar.registerReferenceProvider(
            PlatformPatterns.psiElement(),
            object : PsiReferenceProvider() {
                override fun getReferencesByElement(
                    element: PsiElement,
                    context: ProcessingContext
                ): Array<PsiReference> {
                    println(element)
                    val ref = element.reference!!
                    return arrayOf()
                }
            }
        )
    }
}
