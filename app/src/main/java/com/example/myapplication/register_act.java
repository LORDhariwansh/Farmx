
	 


package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

	public class register_act extends Activity {

		private FirebaseAuth mAuth;
	private View _bg__android_small___8_ek2;
	private View _bg__group_54_ek1;
	private View _bg__group_40_ek1;
	private View _bg__group_24_ek1;
	private View rectangle_62;
	private TextView register;
	private View _bg__group_53_ek1;
	private View _bg__group_52_ek1;
	private View _bg__group_24_ek3;
	private View rectangle_62_ek1;
	private TextView login;
	private TextView framx_register;
	private View _bg__group_50_ek1;
	private View ellipse_1;
	private View ellipse_2;
	private View _bg__group_57_ek1;
	private View rectangle_64;
	private TextView username;
	private View _bg__group_58_ek1;
	private View rectangle_64_ek1;
	private TextView password;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.android_small___8);

		
		_bg__android_small___8_ek2 = (View) findViewById(R.id._bg__android_small___8_ek2);
		_bg__group_54_ek1 = (View) findViewById(R.id._bg__group_54_ek1);
		_bg__group_40_ek1 = (View) findViewById(R.id._bg__group_40_ek1);
		_bg__group_24_ek1 = (View) findViewById(R.id._bg__group_24_ek1);
		rectangle_62 = (View) findViewById(R.id.rectangle_62);
		register = (TextView) findViewById(R.id.register);
		_bg__group_53_ek1 = (View) findViewById(R.id._bg__group_53_ek1);
		_bg__group_52_ek1 = (View) findViewById(R.id._bg__group_52_ek1);
		_bg__group_24_ek3 = (View) findViewById(R.id._bg__group_24_ek3);
		rectangle_62_ek1 = (View) findViewById(R.id.rectangle_62_ek1);
		login = (TextView) findViewById(R.id.login);
		framx_register = (TextView) findViewById(R.id.framx_register);
		_bg__group_57_ek1 = (View) findViewById(R.id._bg__group_57_ek1);
		rectangle_64 = (View) findViewById(R.id.rectangle_64);
		username = (TextView) findViewById(R.id.username);
		_bg__group_58_ek1 = (View) findViewById(R.id._bg__group_58_ek1);
		rectangle_64_ek1 = (View) findViewById(R.id.rectangle_64_ek1);
		password = (TextView) findViewById(R.id.password);
		mAuth = FirebaseAuth.getInstance();

		rectangle_62_ek1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(getApplicationContext(), MainActivity.class);
				startActivity(intent);
			}
		});
		login.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent=new Intent(getApplicationContext(),android_small___10_activity.class);
				startActivity(intent);
				finish();
			}
		});
		rectangle_62.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String usernamer,pass;
				usernamer=String.valueOf(username.getText());
				pass=String.valueOf(password.getText());

				if(TextUtils.isEmpty(usernamer)){
					Toast.makeText(register_act.this, "ENTER USERNAME", Toast.LENGTH_SHORT).show();
					return;

				}
				if(TextUtils.isEmpty(pass)){
					Toast.makeText(register_act.this, "FAILED", Toast.LENGTH_SHORT).show();
					return;
				}

				mAuth.createUserWithEmailAndPassword(usernamer, pass)
						.addOnCompleteListener( new OnCompleteListener<AuthResult>() {
							@Override
							public void onComplete(@NonNull Task<AuthResult> task) {
								if (task.isSuccessful()) {

									Toast.makeText(register_act.this, "ACCOUNT CREATED", Toast.LENGTH_SHORT).show();


								} else {

									Toast.makeText(register_act.this, "Authentication failed.",
											Toast.LENGTH_SHORT).show();
								}
							}
						});
			}
		});




	}
	
	}
	
	