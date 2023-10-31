package com.litongjava.android.utils.permission;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ping E Lee
 * @email itonglinux@qq.com
 * @date 2022/1/28
 */
public class PermissionUtils {
  private static Logger log = LoggerFactory.getLogger(PermissionUtils.class);

  // 检查权限是否已经被授权
  @SuppressLint("NewApi")
  private boolean hasPermissions(Context context, String... permissions) {
    if (context != null && permissions != null) {
      for (String permission : permissions) {
        if (context.checkSelfPermission(permission) != PackageManager.PERMISSION_GRANTED) {
          return false;
        }
      }
    }
    return true;
  }

  @SuppressLint("NewApi")
  public static void requestPermission(Activity activity, String permission, int requestCode) {
    boolean b = activity.checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED;
    //boolean b = ContextCompat.checkSelfPermission(activity, permission) == PackageManager.PERMISSION_GRANTED;
    log.info("checkSelfPermission:{},result:{}", permission, b);
    if (!b) {
      //申请权限
      if (activity.shouldShowRequestPermissionRationale(permission)) {
        log.info("requestPermission:{}", permission);
        activity.requestPermissions(new String[]{permission}, requestCode);
      } else {
        log.info("requestPermission:{}", permission);
        activity.requestPermissions(new String[]{permission}, requestCode);
      }
    }
  }
}