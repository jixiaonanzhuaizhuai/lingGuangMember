package com.example.member;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class LoginActivity extends BaseActivity implements OnClickListener {
	
	private Button loginBtn,regBtn,visitorBtn;
	//private String loginName;
	//private String loginPass;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		initView();
	}

	private void initView() {
		//etLoginName = (EditText) findViewById(R.id.et_loginName);
		//etLoginPass = (EditText) findViewById(R.id.et_loginPass);
		/*loginBtn = (Button) findViewById(R.id.loginBtn);
		regBtn = (Button) findViewById(R.id.regBtn);
		visitorBtn = (Button) findViewById(R.id.visitorBtn);
		loginBtn.setOnClickListener(this);
		regBtn.setOnClickListener(this);
		visitorBtn.setOnClickListener(this);*/
		
	}
	

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.loginBtn:
			showToast("������Ϣ",1);
			break;
		case R.id.regBtn:
			Intent intentReg = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intentReg);
			break;
		case R.id.visitorBtn:
			Intent intentVis = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intentVis);
			break;
		default:
			break;
		}
	}
	
	

}
