// Generated by view binder compiler. Do not edit!
package com.simcoder.uber.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.lorentzos.flingswipe.SwipeFlingAdapterView;
import com.ncorti.slidetoact.SlideToActView;
import com.simcoder.uber.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDriverContentBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final RelativeLayout bottomSheet;

  @NonNull
  public final LinearLayout bringUpBottomLayout;

  @NonNull
  public final ImageView cancel;

  @NonNull
  public final LinearLayout customerInfo;

  @NonNull
  public final ImageView drawerButton;

  @NonNull
  public final SwipeFlingAdapterView frame;

  @NonNull
  public final TextView name;

  @NonNull
  public final FloatingActionButton openMaps;

  @NonNull
  public final FloatingActionButton phone;

  @NonNull
  public final SlideToActView rideStatus;

  @NonNull
  public final Switch workingSwitch;

  private ActivityDriverContentBinding(@NonNull FrameLayout rootView,
      @NonNull RelativeLayout bottomSheet, @NonNull LinearLayout bringUpBottomLayout,
      @NonNull ImageView cancel, @NonNull LinearLayout customerInfo,
      @NonNull ImageView drawerButton, @NonNull SwipeFlingAdapterView frame, @NonNull TextView name,
      @NonNull FloatingActionButton openMaps, @NonNull FloatingActionButton phone,
      @NonNull SlideToActView rideStatus, @NonNull Switch workingSwitch) {
    this.rootView = rootView;
    this.bottomSheet = bottomSheet;
    this.bringUpBottomLayout = bringUpBottomLayout;
    this.cancel = cancel;
    this.customerInfo = customerInfo;
    this.drawerButton = drawerButton;
    this.frame = frame;
    this.name = name;
    this.openMaps = openMaps;
    this.phone = phone;
    this.rideStatus = rideStatus;
    this.workingSwitch = workingSwitch;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDriverContentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDriverContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_driver_content, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDriverContentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomSheet;
      RelativeLayout bottomSheet = rootView.findViewById(id);
      if (bottomSheet == null) {
        break missingId;
      }

      id = R.id.bringUpBottomLayout;
      LinearLayout bringUpBottomLayout = rootView.findViewById(id);
      if (bringUpBottomLayout == null) {
        break missingId;
      }

      id = R.id.cancel;
      ImageView cancel = rootView.findViewById(id);
      if (cancel == null) {
        break missingId;
      }

      id = R.id.customerInfo;
      LinearLayout customerInfo = rootView.findViewById(id);
      if (customerInfo == null) {
        break missingId;
      }

      id = R.id.drawerButton;
      ImageView drawerButton = rootView.findViewById(id);
      if (drawerButton == null) {
        break missingId;
      }

      id = R.id.frame;
      SwipeFlingAdapterView frame = rootView.findViewById(id);
      if (frame == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = rootView.findViewById(id);
      if (name == null) {
        break missingId;
      }

      id = R.id.openMaps;
      FloatingActionButton openMaps = rootView.findViewById(id);
      if (openMaps == null) {
        break missingId;
      }

      id = R.id.phone;
      FloatingActionButton phone = rootView.findViewById(id);
      if (phone == null) {
        break missingId;
      }

      id = R.id.rideStatus;
      SlideToActView rideStatus = rootView.findViewById(id);
      if (rideStatus == null) {
        break missingId;
      }

      id = R.id.workingSwitch;
      Switch workingSwitch = rootView.findViewById(id);
      if (workingSwitch == null) {
        break missingId;
      }

      return new ActivityDriverContentBinding((FrameLayout) rootView, bottomSheet,
          bringUpBottomLayout, cancel, customerInfo, drawerButton, frame, name, openMaps, phone,
          rideStatus, workingSwitch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}