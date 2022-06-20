// Generated by view binder compiler. Do not edit!
package com.demo.DINEio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.demo.DINEio.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.textfield.TextInputEditText;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView Logout;

  @NonNull
  public final TextView balance;

  @NonNull
  public final TextView balanceDesc;

  @NonNull
  public final BottomNavigationView bottomNavView;

  @NonNull
  public final CircleImageView displayPhoto;

  @NonNull
  public final TextInputEditText dob;

  @NonNull
  public final TextInputEditText email;

  @NonNull
  public final TextView fullname;

  @NonNull
  public final TextInputEditText fullnameEditable;

  @NonNull
  public final TextView orders;

  @NonNull
  public final TextView ordersDesc;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final Button updatebtn;

  private ActivityProfileBinding(@NonNull ConstraintLayout rootView, @NonNull TextView Logout,
      @NonNull TextView balance, @NonNull TextView balanceDesc,
      @NonNull BottomNavigationView bottomNavView, @NonNull CircleImageView displayPhoto,
      @NonNull TextInputEditText dob, @NonNull TextInputEditText email, @NonNull TextView fullname,
      @NonNull TextInputEditText fullnameEditable, @NonNull TextView orders,
      @NonNull TextView ordersDesc, @NonNull ProgressBar progressBar, @NonNull Button updatebtn) {
    this.rootView = rootView;
    this.Logout = Logout;
    this.balance = balance;
    this.balanceDesc = balanceDesc;
    this.bottomNavView = bottomNavView;
    this.displayPhoto = displayPhoto;
    this.dob = dob;
    this.email = email;
    this.fullname = fullname;
    this.fullnameEditable = fullnameEditable;
    this.orders = orders;
    this.ordersDesc = ordersDesc;
    this.progressBar = progressBar;
    this.updatebtn = updatebtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Logout;
      TextView Logout = ViewBindings.findChildViewById(rootView, id);
      if (Logout == null) {
        break missingId;
      }

      id = R.id.balance;
      TextView balance = ViewBindings.findChildViewById(rootView, id);
      if (balance == null) {
        break missingId;
      }

      id = R.id.balance_desc;
      TextView balanceDesc = ViewBindings.findChildViewById(rootView, id);
      if (balanceDesc == null) {
        break missingId;
      }

      id = R.id.bottomNavView;
      BottomNavigationView bottomNavView = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavView == null) {
        break missingId;
      }

      id = R.id.display_photo;
      CircleImageView displayPhoto = ViewBindings.findChildViewById(rootView, id);
      if (displayPhoto == null) {
        break missingId;
      }

      id = R.id.dob;
      TextInputEditText dob = ViewBindings.findChildViewById(rootView, id);
      if (dob == null) {
        break missingId;
      }

      id = R.id.email;
      TextInputEditText email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.fullname;
      TextView fullname = ViewBindings.findChildViewById(rootView, id);
      if (fullname == null) {
        break missingId;
      }

      id = R.id.fullname_editable;
      TextInputEditText fullnameEditable = ViewBindings.findChildViewById(rootView, id);
      if (fullnameEditable == null) {
        break missingId;
      }

      id = R.id.orders;
      TextView orders = ViewBindings.findChildViewById(rootView, id);
      if (orders == null) {
        break missingId;
      }

      id = R.id.orders_desc;
      TextView ordersDesc = ViewBindings.findChildViewById(rootView, id);
      if (ordersDesc == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.updatebtn;
      Button updatebtn = ViewBindings.findChildViewById(rootView, id);
      if (updatebtn == null) {
        break missingId;
      }

      return new ActivityProfileBinding((ConstraintLayout) rootView, Logout, balance, balanceDesc,
          bottomNavView, displayPhoto, dob, email, fullname, fullnameEditable, orders, ordersDesc,
          progressBar, updatebtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}