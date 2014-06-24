package com.example.numberkey;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;

public class KeyImageView extends ImageView {

	public KeyImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		if (isDrawCircle) {
			Paint mPaint = new Paint();
			canvas.drawCircle((int) getWidth() / 2, (int) getHeight() / 2, 15,
					mPaint);
		}

		super.onDraw(canvas);
	}

	boolean isDrawCircle = false;

	public boolean isDrawCircle() {
		return isDrawCircle;
	}

	public void setDrawCircle(boolean isDrawCircle) {
		this.isDrawCircle = isDrawCircle;
	}

	public void drawCircle(boolean isD) {
		this.isDrawCircle = isD;
		this.invalidate();
	}

}
