package com.example.broadcastbestpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {
	private EditText accountEdit,passwordEdit;
	private Button login;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        accountEdit=(EditText) findViewById(R.id.account);
        passwordEdit=(EditText) findViewById(R.id.password);
        login=(Button) findViewById(R.id.login);
        
        login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
			String account=accountEdit.getText().toString();
			String password=passwordEdit.getText().toString();
			
			if(account.equals("haru")&&password.equals("654321")){
				Intent intent =new Intent(LoginActivity.this,
						MainActivity.class);
				startActivity(intent);
				finish();
			}
			else{
				Toast.makeText(LoginActivity.this, "account or passwordis invalid",
						Toast.LENGTH_SHORT).show();
			}
			}
		});
    }
}
