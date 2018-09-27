// Generated code from Butter Knife. Do not modify!
package com.example.brizz.dycodetest;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DetailActivity_ViewBinding implements Unbinder {
  private DetailActivity target;

  @UiThread
  public DetailActivity_ViewBinding(DetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DetailActivity_ViewBinding(DetailActivity target, View source) {
    this.target = target;

    target.ivImageDetail = Utils.findRequiredViewAsType(source, R.id.iv_image_detail, "field 'ivImageDetail'", ImageView.class);
    target.tvNameDetail = Utils.findRequiredViewAsType(source, R.id.tv_name_detail, "field 'tvNameDetail'", TextView.class);
    target.tvDescDetail = Utils.findRequiredViewAsType(source, R.id.tv_desc_detail, "field 'tvDescDetail'", TextView.class);
    target.tvDobDetail = Utils.findRequiredViewAsType(source, R.id.tv_dob_detail, "field 'tvDobDetail'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivImageDetail = null;
    target.tvNameDetail = null;
    target.tvDescDetail = null;
    target.tvDobDetail = null;
  }
}
