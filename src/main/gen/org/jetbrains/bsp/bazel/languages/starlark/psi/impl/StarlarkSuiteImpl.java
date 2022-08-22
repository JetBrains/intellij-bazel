// This is a generated file. Not intended for manual editing.
package org.jetbrains.bsp.bazel.languages.starlark.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.jetbrains.bsp.bazel.languages.starlark.StarlarkTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.jetbrains.bsp.bazel.languages.starlark.psi.*;

public class StarlarkSuiteImpl extends ASTWrapperPsiElement implements StarlarkSuite {

  public StarlarkSuiteImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StarlarkVisitor visitor) {
    visitor.visitSuite(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StarlarkVisitor) accept((StarlarkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public StarlarkSimpleStmt getSimpleStmt() {
    return findChildByClass(StarlarkSimpleStmt.class);
  }

  @Override
  @NotNull
  public List<StarlarkStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StarlarkStatement.class);
  }

}
