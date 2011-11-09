package com.codeundone.andevcon.demo07;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codeundone.andevcon.R;

public class DialogsActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.demo_07_dialogs_view);
	}
	
	public void onDialog(View view) {
		Dialog d = new Dialog(this, R.style.MyDialogTheme);
		d.setContentView(new Button(this));
		d.setTitle("Regular Dialog");
		d.setCancelable(true);
		d.show();
	}
	
	public void onAlertDialog(View view) {
		new AlertDialog.Builder(this)
			.setTitle("Alert Dialog")
			.setMessage("This is an Alert Dialog.\nIsn't it amazing?")
			.setPositiveButton("Okay", this)
			.create().show();
	}

	@Override
	public void onClick(DialogInterface dialog, int which) {
		dialog.dismiss();
	}
	
}
