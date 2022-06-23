package com.litongjava.litongjavaandroidutils;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.litongjava.android.utils.VersionUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainActivity extends AppCompatActivity {

  private Logger log= LoggerFactory.getLogger(this.getClass());
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    log.info(VersionUtils.VERSION);
  }
}