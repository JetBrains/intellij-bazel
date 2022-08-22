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

public class StarlarkPrimaryExprImpl extends ASTWrapperPsiElement implements StarlarkPrimaryExpr {

  public StarlarkPrimaryExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StarlarkVisitor visitor) {
    visitor.visitPrimaryExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StarlarkVisitor) accept((StarlarkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public StarlarkOperand getOperand() {
    return findNotNullChildByClass(StarlarkOperand.class);
  }

  @Override
  @NotNull
  public List<StarlarkPrimaryExpr1> getPrimaryExpr1List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StarlarkPrimaryExpr1.class);
  }

}
