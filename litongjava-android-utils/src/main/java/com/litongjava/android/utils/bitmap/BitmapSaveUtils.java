package com.litongjava.android.utils.bitmap;

import android.graphics.Bitmap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ping E Lee
 * @email itonglinux@qq.com
 * @date 2022/1/12
 */
public class BitmapSaveUtils {
  /**
   * 将图片保存到本地,返回保存后的地址
   *
   * @param bitmap
   * @param baseName
   * @throws IOException
   */
  public static File saveToLocal(Bitmap bitmap, String baseName) {
    File file = new File("/sdcard/DCIM/Camera/ppnt" + baseName + ".jpg");
    if (file.exists()) {
      file.delete();
    }


    try (FileOutputStream out = new FileOutputStream(file);) {
      if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, out)) {
        out.flush();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return file;
  }
}