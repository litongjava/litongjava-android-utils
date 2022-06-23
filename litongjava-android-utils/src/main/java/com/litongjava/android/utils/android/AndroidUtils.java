package com.litongjava.android.utils.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ping E Lee
 * @email itonglinux@qq.com
 * @date 2022/3/8
 */
public class AndroidUtils {
  /**
   * 根据appName判断是否已经安装该app
   *
   * @return 是否已经安装
   */
  public static boolean hasAPP(Context context, String appName) {
    PackageManager pm = context.getApplicationContext().getPackageManager();
    List<PackageInfo> pinfo = pm.getInstalledPackages(0);

    if (pinfo != null) {
      for (int i = 0; i < pinfo.size(); i++) {
        PackageInfo info = pinfo.get(i);
        if(info.packageName.equals(appName)){
          return true;
        }
      }
    }
    return false;
  }
}
