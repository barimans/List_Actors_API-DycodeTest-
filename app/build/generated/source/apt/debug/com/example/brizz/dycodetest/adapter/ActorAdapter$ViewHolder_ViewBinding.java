// Generated code from Butter Knife. Do not modify!
package com.example.brizz.dycodetest.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.brizz.dycodetest.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ActorAdapter$ViewHolder_ViewBinding implements Unbinder {
  private ActorAdapter.ViewHolder target;

  @UiThread
  public ActorAdapter$ViewHolder_ViewBinding(ActorAdapter.ViewHolder target, View source) {
    this.target = target;

    target.cvList = Utils.findRequiredViewAsType(source, R.id.cv_list, "field 'cvList'", CardView.class);
    target.ivImageList = Utils.findRequiredViewAsType(source, R.id.iv_image_list, "field 'ivImageList'", ImageView.class);
    target.tvNameList = Utils.findRequiredViewAsType(source, R.id.tv_name_list, "field 'tvNameList'", TextView.class);
    target.tvDescList = Utils.findRequiredViewAsType(source, R.id.tv_desc_list, "field 'tvDescList'", TextView.class);
    target.tvDobList = Utils.findRequiredViewAsType(source, R.id.tv_dob_list, "field 'tvDobList'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ActorAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cvList = null;
    target.ivImageList = null;
    target.tvNameList = null;
    target.tvDescList = null;
    target.tvDobList = null;
  }
}
