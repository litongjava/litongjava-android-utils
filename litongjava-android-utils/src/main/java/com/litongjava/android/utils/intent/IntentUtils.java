package com.litongjava.android.utils.intent;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import java.io.File;

/**
 * @author Ping E Lee
 * @email itonglinux@qq.com
 * @date 2022/1/12
 */
public class IntentUtils {
  public static void scanFile(Context context, File file) {
    Intent intent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
    Uri uri = Uri.fromFile(file);
    intent.setData(uri);
    context.sendBroadcast(intent);
  }
}