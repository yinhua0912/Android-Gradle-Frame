package com.android.frame.app.controller;

import android.os.Handler;
import android.os.Looper;

/**
 * Created with IntelliJ IDEA.
 *
 * @author hua.yin
 * @version 4.1.0
 * @since: 2015/6/21 11:47
 */
public class BaseController {
    private Handler mHandler = new Handler(Looper.getMainLooper());
    public <T> void runOnUi(T t) {
       mHandler.post(new Runnable() {
           @Override
           public void run() {
           }
       });
    }
}
