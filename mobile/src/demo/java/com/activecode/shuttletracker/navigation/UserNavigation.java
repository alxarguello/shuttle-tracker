package com.activecode.shuttletracker.navigation;

import android.app.Activity;
import android.view.MenuItem;

import com.activecode.shuttletracker.R;

/**
 * Created by alxarguello on 1/25/16.
 */
public class UserNavigation extends UXNavigation {

    UserNavigation(){

    }

    public  boolean onNavigationItemSelected(Activity context, MenuItem item){
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_plainlivetrack) {

        }

        return super.onNavigationItemSelected(context,item);
    }
}
