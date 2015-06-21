package com.android.frame.app.controller;

import android.graphics.Bitmap;

import com.android.frame.module.splash.ISplashModule;
import com.android.frame.module.splash.SplashCallback;
import com.android.frame.module.splash.SplashModule;

/**
 * Created with IntelliJ IDEA.
 *
 * @author hua.yin
 * @version 4.1.0
 * @since: 2015/6/19 14:51
 */
public class SplashController extends BaseController {
    private ISplashView mISplashView;
    private ISplashModule mISplashModule;

    public SplashController(ISplashView iSplashView) {
        mISplashView = iSplashView;
        mISplashModule = new SplashModule();
    }

    public void loadSplash() {
        mISplashModule.loadSplash(new SplashCallback() {
            @Override
            public void loadSplashImage(Bitmap bitmap) {
                if (bitmap == null) {
                }
//                runOnUi(new );
               mISplashView.loadSplashFinish(bitmap);
            }
        });
    }
}
