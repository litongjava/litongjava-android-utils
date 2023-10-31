package com.litongjava.android.utils.thread;

import com.blankj.utilcode.util.ThreadUtils;

public class ThreadIOUtils {

  public static <T> void executeByIo(BackgroundTask<T> task) {
    ThreadUtils.executeByIo(task);
  }
}
