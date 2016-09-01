package com.nd;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

public class ScreenInformation extends CordovaPlugin {

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    if (action.equals("get_information")) {
      DisplayMetrics dm = new DisplayMetrics();
      this.cordova.getActivity().getWindowManager().getDefaultDisplay().getMetrics(dm);

      String density_name = "";
      double density_point = (double)dm.density;
      double width = (double)dm.widthPixels;
      double height = (double)dm.heightPixels;
      double xdpi = (double)dm.xdpi;
      double ydpi = (double)dm.ydpi;

      if (density_point >= 4.0) {
        density_name = "xxxhdpi";
      } else if (density_point >= 3.0) {
        density_name = "xxhdpi";
      } else if (density_point >= 2.0) {
        density_name = "xhdpi";
      } else if (density_point >= 1.5) {
        density_name = "hdpi";
      } else if (density_point >= 1.0) {
        density_name = "mdpi";
      } else {
        density_name = "ldpi";
      }

      JSONObject result = new JSONObject();
      try {
        result.put("density_point", density_point);
        result.put("density_name", density_name);
        result.put("width", width);
        result.put("height", height);
        result.put("xdpi", xdpi);
        result.put("ydpi", ydpi);
      } catch (JSONException e) {}

      callbackContext.success(result);

      return true;
    } else {
      return false;
    }
  }
}
