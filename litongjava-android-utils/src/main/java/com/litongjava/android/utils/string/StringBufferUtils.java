package com.litongjava.android.utils.string;

/**
 * @author Ping E Lee
 * @email itonglinux@qq.com
 * @date 2022/1/28
 */
public class StringBufferUtils {
  /**
   * 添加换行符
   * @param stringBuffer
   * @param s
   */
  public static void appendLine(StringBuffer stringBuffer, String s) {
    stringBuffer.append(s+"\n");
  }
}