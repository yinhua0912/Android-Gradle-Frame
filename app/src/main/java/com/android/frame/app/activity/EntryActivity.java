package com.android.frame.app.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import com.android.frame.R;
import com.android.frame.app.controller.ISplashView;
import com.android.frame.app.controller.SplashController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author hua.yin
 * @version 4.1.0
 * @since: 2015/6/19 11:42
 */
public class EntryActivity  extends BaseActivity implements ISplashView {
    private ImageView mSplashView;
    private SplashController mSplashController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        mSplashView = (ImageView) findViewById(R.id.imageview_splash);
        mSplashController = new SplashController(this);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            mSplashController.loadSplash();
        }
    }

    private void startMainActivity() {
        final Intent intent = new Intent(this, MainActivity.class).setData(getIntent().getData()).putExtras(getIntent());
        intent.fillIn(getIntent(), Intent.FILL_IN_ACTION | Intent.FILL_IN_DATA | Intent.FILL_IN_SOURCE_BOUNDS);
        startActivity(intent);
        finish();
    }

    @Override
    public void loadSplashFinish(Bitmap bitmap) {
        mSplashView.setImageBitmap(bitmap);
        startMainActivity();
    }
}
