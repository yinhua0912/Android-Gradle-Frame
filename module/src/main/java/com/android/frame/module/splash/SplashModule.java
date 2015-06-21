package com.android.frame.module.splash;

import com.android.frame.module.BaseModule;

/**
 * Created with IntelliJ IDEA.
 *
 * @author hua.yin
 * @version 4.1.0
 * @since: 2015/6/19 14:42
 */
public class SplashModule extends BaseModule implements ISplashModule {
    @Override
    public void loadSplash(SplashCallback splashCallback) {
       splashCallback.loadSplashImage(null);
    }
}
