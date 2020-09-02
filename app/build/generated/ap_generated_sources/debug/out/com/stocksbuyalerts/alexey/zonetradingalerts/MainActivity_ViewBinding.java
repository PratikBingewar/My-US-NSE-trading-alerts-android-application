// Generated code from Butter Knife. Do not modify!
package com.stocksbuyalerts.alexey.zonetradingalerts;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.errorMessageTextView = Utils.findRequiredViewAsType(source, R.id.tv_error_message_diaplay, "field 'errorMessageTextView'", TextView.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.rv_alertsList, "field 'mRecyclerView'", RecyclerView.class);
    target.mRecyclerViewNews = Utils.findRequiredViewAsType(source, R.id.rv_news_list, "field 'mRecyclerViewNews'", RecyclerView.class);
    target.tvLink = Utils.findRequiredViewAsType(source, R.id.tv_link, "field 'tvLink'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.errorMessageTextView = null;
    target.mRecyclerView = null;
    target.mRecyclerViewNews = null;
    target.tvLink = null;
  }
}
