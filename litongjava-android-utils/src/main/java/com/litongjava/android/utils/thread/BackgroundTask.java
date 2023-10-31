package com.litongjava.android.utils.thread;


public interface BackgroundTask<T> {

  public T doInBackground() throws Throwable;
}