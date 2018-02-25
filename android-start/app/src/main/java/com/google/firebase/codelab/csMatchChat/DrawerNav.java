package com.google.firebase.codelab.csMatchChat;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * author: Marcus
 */

public class DrawerNav extends AppCompatActivity {
    private DrawerLayout myDrawer;
    private ActionBarDrawerToggle myToggle;

    private MenuItem mProfileMenuItem;

    private MenuItem mChatMenuItem;

    private MenuItem mSearchMenuItem;

    private MenuItem mSignoutMenuItem;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDrawer = (DrawerLayout) findViewById(R.id.myDrawer);
        myToggle = new ActionBarDrawerToggle(this, myDrawer, R.string.open, R.string.close);

        myDrawer.addDrawerListener(myToggle);
        myToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(myToggle.onOptionsItemSelected(item)) {
            return true;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);


        mProfileMenuItem = menu.findItem(R.id.profile);
        mProfileMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                //Put code that you want to implement
                return false;
            }
        });

        mChatMenuItem = menu.findItem(R.id.chat);
        mChatMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                //Put code that you want to implement
                return false;
            }
        });

        mSearchMenuItem = menu.findItem(R.id.search);
        mSearchMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                //Put code that you want to implement
                return false;
            }
        });

        mSignoutMenuItem = menu.findItem(R.id.sign_out_menu);
        mSignoutMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                //Put code that you want to implement
                return false;
            }
        });
        return false;


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

    /*public ActionBar getSupportActionBar() {
        return null;
    }*/

}


