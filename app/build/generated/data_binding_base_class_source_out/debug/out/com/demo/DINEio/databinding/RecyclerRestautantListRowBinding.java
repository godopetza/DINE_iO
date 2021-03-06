// Generated by view binder compiler. Do not edit!
package com.demo.DINEio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.demo.DINEio.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RecyclerRestautantListRowBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final ImageView thumbImage;

  @NonNull
  public final TextView tvRestaurantAddress;

  @NonNull
  public final TextView tvRestaurantHours;

  @NonNull
  public final TextView tvRestaurantName;

  private RecyclerRestautantListRowBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView cardView, @NonNull ImageView thumbImage,
      @NonNull TextView tvRestaurantAddress, @NonNull TextView tvRestaurantHours,
      @NonNull TextView tvRestaurantName) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.thumbImage = thumbImage;
    this.tvRestaurantAddress = tvRestaurantAddress;
    this.tvRestaurantHours = tvRestaurantHours;
    this.tvRestaurantName = tvRestaurantName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RecyclerRestautantListRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RecyclerRestautantListRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.recycler_restautant_list_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RecyclerRestautantListRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.thumbImage;
      ImageView thumbImage = ViewBindings.findChildViewById(rootView, id);
      if (thumbImage == null) {
        break missingId;
      }

      id = R.id.tvRestaurantAddress;
      TextView tvRestaurantAddress = ViewBindings.findChildViewById(rootView, id);
      if (tvRestaurantAddress == null) {
        break missingId;
      }

      id = R.id.tvRestaurantHours;
      TextView tvRestaurantHours = ViewBindings.findChildViewById(rootView, id);
      if (tvRestaurantHours == null) {
        break missingId;
      }

      id = R.id.tvRestaurantName;
      TextView tvRestaurantName = ViewBindings.findChildViewById(rootView, id);
      if (tvRestaurantName == null) {
        break missingId;
      }

      return new RecyclerRestautantListRowBinding((ConstraintLayout) rootView, cardView, thumbImage,
          tvRestaurantAddress, tvRestaurantHours, tvRestaurantName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
