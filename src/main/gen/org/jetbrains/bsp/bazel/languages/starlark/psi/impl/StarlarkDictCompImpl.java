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

public class StarlarkDictCompImpl extends ASTWrapperPsiElement implements StarlarkDictComp {

  public StarlarkDictCompImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StarlarkVisitor visitor) {
    visitor.visitDictComp(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StarlarkVisitor) accept((StarlarkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<StarlarkCompClause> getCompClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StarlarkCompClause.class);
  }

  @Override
  @NotNull
  public StarlarkEntry getEntry() {
    return findNotNullChildByClass(StarlarkEntry.class);
  }

}
