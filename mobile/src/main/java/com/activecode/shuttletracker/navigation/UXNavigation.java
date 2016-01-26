package com.activecode.shuttletracker.navigation;

import android.app.Activity;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import com.activecode.shuttletracker.R;

/**
 * Created by alxarguello on 1/25/16.
 */
public abstract class UXNavigation {

    private static UserNavigation userNavigation;

    public static UXNavigation getInstance(Class<UserNavigation> userNavigationClass) {

        try {
            if (userNavigation == null) {
                userNavigation = userNavigationClass.newInstance();
            }
        }catch(IllegalAccessException e){
        }catch(InstantiationException e){
        }
        return userNavigation;
    }

    public boolean onNavigationItemSelected(Activity context, MenuItem item){

        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_routes) {

        }else if (id == R.id.nav_settings) {

        } else if (id == R.id.nav_share) {

        }
        DrawerLayout drawer = (DrawerLayout) context.findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

}
