package com.example.numberkey;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener {

	KeyImageView key1, key2, key3, key4;

	ArrayList<KeyImageView> keyViews = new ArrayList<KeyImageView>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.button1).setOnClickListener(this);
		findViewById(R.id.button2).setOnClickListener(this);
		findViewById(R.id.button3).setOnClickListener(this);
		findViewById(R.id.button4).setOnClickListener(this);
		findViewById(R.id.button5).setOnClickListener(this);
		findViewById(R.id.button6).setOnClickListener(this);
		findViewById(R.id.button7).setOnClickListener(this);
		findViewById(R.id.button8).setOnClickListener(this);
		findViewById(R.id.button9).setOnClickListener(this);
		findViewById(R.id.button0).setOnClickListener(this);
		findViewById(R.id.button_delete).setOnClickListener(this);

		key1 = (KeyImageView) findViewById(R.id.imageView1);
		key2 = (KeyImageView) findViewById(R.id.imageView2);
		key3 = (KeyImageView) findViewById(R.id.imageView3);
		key4 = (KeyImageView) findViewById(R.id.imageView4);

		keyViews.add(key1);
		keyViews.add(key2);
		keyViews.add(key3);
		keyViews.add(key4);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void event() {
		for (int i = 0; i < keyViews.size(); i++) {
			KeyImageView view = keyViews.get(i);
			if (!view.isDrawCircle()) {
				view.drawCircle(true);
				return;
			}
		}
	}

	public void delete() {
		for (int i = 0; i < keyViews.size(); i++) {
			KeyImageView view = keyViews.get(i);
				view.drawCircle(false);
		}
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub

		switch (arg0.getId()) {
		case R.id.button1:
			event();
			break;
		case R.id.button2:
			event();
			break;
		case R.id.button3:
			event();
			break;
		case R.id.button4:
			event();
			break;
		case R.id.button5:
			event();
			break;
		case R.id.button6:
			event();
			break;
		case R.id.button7:
			event();
			break;
		case R.id.button8:
			event();
			break;
		case R.id.button9:
			event();
			break;
		case R.id.button_delete:
			delete();
			break;
		default:
			break;

		}
	}

}
