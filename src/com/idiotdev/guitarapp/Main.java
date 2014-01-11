package com.idiotdev.guitarapp;
import com.idiotdev.guitarapp.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.content.Intent;

import com.idiotdev.guitarapp.R;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class Main extends Activity implements OnClickListener{
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button play=(Button)findViewById(R.id.playb);
        Button makecode=(Button)findViewById(R.id.makecodeb);
        Button setting=(Button)findViewById(R.id.settingb);
        play.setOnClickListener(this);
        makecode.setOnClickListener(this);
        setting.setOnClickListener(this);
    }
	Intent intent;
	@Override
	public void onClick(View v){
		switch(v.getId()){
		case R.id.playb :
			intent = new Intent(Main.this,play.class);
			startActivity(intent);
			break;
			
		case R.id.makecodeb :
			intent = new Intent(Main.this,makecode.class);
			startActivity(intent);
			break;
		
		case R.id.settingb :
			intent = new Intent(Main.this,setting.class);
			startActivity(intent);
			break;
			
			
		}
	}
}
