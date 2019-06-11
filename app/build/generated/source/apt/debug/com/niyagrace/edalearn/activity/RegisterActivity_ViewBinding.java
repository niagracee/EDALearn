// Generated code from Butter Knife. Do not modify!
package com.niyagrace.edalearn.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.niyagrace.edalearn.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RegisterActivity_ViewBinding implements Unbinder {
  private RegisterActivity target;

  @UiThread
  public RegisterActivity_ViewBinding(RegisterActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RegisterActivity_ViewBinding(RegisterActivity target, View source) {
    this.target = target;

    target.etNama = Utils.findRequiredViewAsType(source, R.id.etNama, "field 'etNama'", EditText.class);
    target.etNim = Utils.findRequiredViewAsType(source, R.id.etNim, "field 'etNim'", EditText.class);
    target.etEmail = Utils.findRequiredViewAsType(source, R.id.etEmail, "field 'etEmail'", EditText.class);
    target.etPassword = Utils.findRequiredViewAsType(source, R.id.etPassword, "field 'etPassword'", EditText.class);
    target.btnRegister = Utils.findRequiredViewAsType(source, R.id.btnRegister, "field 'btnRegister'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RegisterActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etNama = null;
    target.etNim = null;
    target.etEmail = null;
    target.etPassword = null;
    target.btnRegister = null;
  }
}
