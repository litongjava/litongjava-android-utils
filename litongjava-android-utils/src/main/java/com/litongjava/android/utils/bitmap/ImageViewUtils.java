package com.litongjava.android.utils.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * @author Ping E Lee
 * @email itonglinux@qq.com
 * @date 2022/1/12
 */
public class ImageViewUtils {
  public static Bitmap getBitmap(ImageView imageView) {
    Drawable drawable = imageView.getDrawable();
    return getBitmap(drawable);
  }

  public static Bitmap getBitmap(Drawable drawable) {
    BitmapDrawable bitmapDrawable=(BitmapDrawable) drawable;
    return bitmapDrawable.getBitmap();
  }
}