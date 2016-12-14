package com.example.member;


import android.R.integer;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class BaseActivity extends Activity {

	protected Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//一般子类用到context的时候都可以直接用，但是当需要弹出dialog时除外
		context = getApplicationContext();
	}
	
	public void showToast(String string , int time) {
		Toast.makeText(BaseActivity.this, string, time).show();
	}
	//获取textView中的内容
	public String getText(TextView v) {
		return v.getText().toString().trim();
	}
	
}
