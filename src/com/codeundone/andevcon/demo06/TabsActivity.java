package com.codeundone.andevcon.demo06;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

import com.codeundone.andevcon.R;

public class TabsActivity extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.demo_06_tabs_view);

	    Resources res = getResources(); // Resource object to get Drawables
	    TabHost tabHost = getTabHost();  // The activity TabHost
	    TabHost.TabSpec spec;  // Reusable TabSpec for each tab
	    Intent intent;  // Reusable Intent for each tab

	    // Create an Intent to launch an Activity for the tab (to be reused)
	    intent = new Intent().setClass(this, Tab1Activity.class);

	    // Initialize a TabSpec for each tab and add it to the TabHost
//	    spec = tabHost.newTabSpec("artists").setIndicator("Artists",
//	                      res.getDrawable(android.R.drawable.ic_input_add))
//	                  .setContent(intent);
	    View tab1 = View.inflate(this, R.layout.demo_06_tabs_view, null);
	    spec = tabHost.newTabSpec("artists").setIndicator(tab1)
	    		.setContent(intent);
	    tabHost.addTab(spec);

	    // Do the same for the other tabs
	    intent = new Intent().setClass(this, Tab2Activity.class);
	    spec = tabHost.newTabSpec("albums").setIndicator("Albums",
	                      res.getDrawable(android.R.drawable.ic_dialog_alert))
	                  .setContent(intent);
	    tabHost.addTab(spec);

	    intent = new Intent().setClass(this, Tab3Activity.class);
	    spec = tabHost.newTabSpec("songs").setIndicator("Songs",
	                      res.getDrawable(android.R.drawable.ic_dialog_info))
	                  .setContent(intent);
	    tabHost.addTab(spec);
	}
}
