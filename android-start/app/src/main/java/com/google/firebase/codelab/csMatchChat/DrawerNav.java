package com.google.firebase.codelab.csMatchChat;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.view.View;

/**
 * author: Marcus
 */

public class DrawerNav extends Activity {
    private DrawerLayout myDrawer;
    private ActionBarDrawerToggle myToggle;

    private MenuItem mProfileMenuItem;

    private MenuItem mChatMenuItem;

    private MenuItem mSearchMenuItem;

    private MenuItem mLogoutMenuItem;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_nav);

        myDrawer = (DrawerLayout) findViewById(R.id.myDrawer);
        myToggle = new ActionBarDrawerToggle(this,myDrawer,R.string.open,R.string.close);

        myDrawer.addDrawerListener(myToggle);
        myToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mProfileMenuItem = (MenuItem) findViewById(R.id.profile);
        mProfileMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                //Put code that you want to implement
                return false;
            }
        });

        mChatMenuItem = (MenuItem) findViewById(R.id.chat);
        mChatMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                //Put code that you want to implement
                return false;
            }
        });

        mSearchMenuItem = (MenuItem) findViewById(R.id.search);
        mSearchMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                //Put code that you want to implement
                return false;
            }
        });

        mLogoutMenuItem = (MenuItem) findViewById(R.id.logout);
        mLogoutMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                //Put code that you want to implement
                return false;
            }
        });


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(myToggle.onOptionsItemSelected(item)) {
            return true;

        }
        return super.onOptionsItemSelected(item);
    }

    public void goBackToMain(View v) {
        this.finish();
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onRestart() {
        super.onRestart();
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onPause() {
        super.onPause();
    }

    protected void onStop() {
        super.onStop();
    }

    protected void onDestroy() {
        super.onDestroy();
    }
}

