// Generated code from Butter Knife. Do not modify!
package com.example.brizz.dycodetest;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
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

    target.mainToolbar = Utils.findRequiredViewAsType(source, R.id.main_toolbar, "field 'mainToolbar'", Toolbar.class);
    target.recviewActors = Utils.findRequiredViewAsType(source, R.id.recview_actors, "field 'recviewActors'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mainToolbar = null;
    target.recviewActors = null;
  }
}
