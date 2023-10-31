package com.litongjava.android.utils.thread;


import com.blankj.utilcode.util.ThreadUtils;

public abstract class BackgroundTask<T> extends ThreadUtils.Task<T> {
  @Override
  public void onSuccess(T result) {
  }

  @Override
  public void onCancel() {
  }

  @Override
  public void onFail(Throwable t) {
  }
}