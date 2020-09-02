// Generated code from Butter Knife. Do not modify!
package com.stocksbuyalerts.alexey.zonetradingalerts;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddWidgetActivity_ViewBinding implements Unbinder {
  private AddWidgetActivity target;

  private View view2131296301;

  @UiThread
  public AddWidgetActivity_ViewBinding(AddWidgetActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AddWidgetActivity_ViewBinding(final AddWidgetActivity target, View source) {
    this.target = target;

    View view;
    target.vSymbol = Utils.findRequiredViewAsType(source, R.id.et_symbol, "field 'vSymbol'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_addWidget, "field 'btnAddWidget' and method 'submit'");
    target.btnAddWidget = Utils.castView(view, R.id.btn_addWidget, "field 'btnAddWidget'", Button.class);
    view2131296301 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.submit();
      }
    });
    target.tvErrorMessage = Utils.findRequiredViewAsType(source, R.id.tv_wrong_symbol, "field 'tvErrorMessage'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddWidgetActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.vSymbol = null;
    target.btnAddWidget = null;
    target.tvErrorMessage = null;

    view2131296301.setOnClickListener(null);
    view2131296301 = null;
  }
}
