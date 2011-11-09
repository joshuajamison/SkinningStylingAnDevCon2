package com.codeundone.andevcon;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.codeundone.andevcon.demo01.StylesThemesActivity;
import com.codeundone.andevcon.demo02.InheritanceActivity;
import com.codeundone.andevcon.demo03.BackgroundsActivity;
import com.codeundone.andevcon.demo04.ButtonsActivity;
import com.codeundone.andevcon.demo05.ImagesActivity;
import com.codeundone.andevcon.demo06.TabsActivity;
import com.codeundone.andevcon.demo07.DialogsActivity;
import com.codeundone.andevcon.demo09.WidgetsActivity;

public class AnDevCon2DemosActivity extends ListActivity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        String[] items = getResources().getStringArray(R.array.main_items);
        
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
    }
    
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	super.onListItemClick(l, v, position, id);
    	
    	Intent i = new Intent();

    	switch (position) {
    	
    	case 0:				//        <item >Styles &amp; Themes</item>
    		i.setClass(this, StylesThemesActivity.class);
    		break;
    	case 1:				//        <item >Inheritance</item>
    		i.setClass(this, InheritanceActivity.class);
    		break;
    	case 2:				//        <item >Backgrounds</item>
    		i.setClass(this, BackgroundsActivity.class);
    		break;
    	case 3:				//        <item >Buttons</item>
    		i.setClass(this, ButtonsActivity.class);
    		break;
    	case 4:				//        <item >Images</item>
    		i.setClass(this, ImagesActivity.class);
    		break;
    	case 5:				//        <item >Tabs</item>
    		i.setClass(this, TabsActivity.class);
    		break;
    	case 6:				//        <item >Dialogs</item>
    		i.setClass(this, DialogsActivity.class);
    		break;
    	case 7:				//        <item >Draw9Patch</item>
    		i.setClass(this, WidgetsActivity.class);
    		break;
    	case 8:				//        <item >Widgets</item>
    		i.setClass(this, WidgetsActivity.class);
    		break;
    		
    	}
    	
    	startActivity(i);
    }
}
