// Generated code from Butter Knife. Do not modify!
package com.niyagrace.edalearn.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.niyagrace.edalearn.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ProfilActivity_ViewBinding implements Unbinder {
  private ProfilActivity target;

  @UiThread
  public ProfilActivity_ViewBinding(ProfilActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ProfilActivity_ViewBinding(ProfilActivity target, View source) {
    this.target = target;

    target.tvResultNama = Utils.findRequiredViewAsType(source, R.id.tvResultNama, "field 'tvResultNama'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ProfilActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvResultNama = null;
  }
}
