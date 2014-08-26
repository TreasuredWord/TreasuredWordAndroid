package com.treasuredword.treasuredword.activities;

import android.content.Intent;

import com.hacktoolkit.android.activities.HTKSplashScreenActivity;
import com.hacktoolkit.android.utils.HTKUtils;
import com.treasuredword.treasuredword.R;

public class SplashScreenActivity extends HTKSplashScreenActivity {

	protected int getLayoutId() {
		return R.layout.activity_splash_screen;
	}

	protected int getSplashDurationMillis() {
		return 2500;
	}
	
	protected Intent getNextActivity() {
		return HTKUtils.getActivityIntent("com.treasuredword.treasuredword", "com.treasuredword.treasuredword.activities.HelloWorldActivity");
	}
}
