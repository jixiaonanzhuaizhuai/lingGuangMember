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
		//һ�������õ�context��ʱ�򶼿���ֱ���ã����ǵ���Ҫ����dialogʱ����
		context = getApplicationContext();
	}
	
	public void showToast(String string , int time) {
		Toast.makeText(BaseActivity.this, string, time).show();
	}
	//��ȡtextView�е�����
	public String getText(TextView v) {
		return v.getText().toString().trim();
	}
	
}
