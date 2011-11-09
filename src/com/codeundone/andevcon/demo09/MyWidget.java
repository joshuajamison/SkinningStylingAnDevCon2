package com.codeundone.andevcon.demo09;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

import com.codeundone.andevcon.R;

public class MyWidget extends TextView {

	private boolean reverse;

	public MyWidget(Context context) {
		this(context, null);
	}
	
	public MyWidget(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}
	
	public MyWidget(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs);
		
		TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.MyWidget, defStyle, 0);
		
		reverse = a.getBoolean(R.styleable.MyWidget_reverseText, false);
		
		a.recycle();
		
		setText(getText());
	}
	
	@Override
	public void setText(CharSequence text, BufferType type) {
		if (reverse) {
			StringBuilder sb = new StringBuilder(text);
			super.setText(sb.reverse().toString(), type);
		} else {
			super.setText(text, type);
		}
	}

}
