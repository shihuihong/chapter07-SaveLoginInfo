package com.example.savelongininfo1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
	loginPreferences = getSharedPreferences("login",Context.MODE_PRIVATE);
	accessPreferences=getSharedPreferences("access",
			Context.MODE_WORLD_READABLE);
	int count =accessPreferences.getInt("cuont",1);
	Toast.makeText(MainActivity.this,"欢迎您，这是第"+count+"次访问！",
	Toast.LENGTH_LONG).show();
	loginEditor=loginPreferences.edit();
	accessEditor=accessPreferences.edit();
	accessEditor.putInt("count",++count)
	accessEditor.commit();
	userName=loginPreferences.getString("name",null);
	userPsd=loginPreferences.getString("psd",null);
	isSavePsd=loginPreferences.getBoolean("isSavePsd",false);
	       isAutoLogin=loginPreferences.getBoolean("isAutoLogin",
	    		   false);
	       if(isAutoLogin){
	    	   this.setContentView(R.layout.activity_welcome);
	    	   userInfo.setText("欢迎您："+userName+",登陆成功！");
	    	   
	    	
	       }esle{
	    	   loadActivity();
	       }
	
	
		
	}

	private void loadActivity() {
		// TODO Auto-generated method stub
		
	}



}
