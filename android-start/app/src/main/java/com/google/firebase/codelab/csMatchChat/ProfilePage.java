package com.google.firebase.codelab.csMatchChat;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.google.android.gms.auth.api.Auth;

import static com.google.firebase.codelab.csMatchChat.MainActivity.ANONYMOUS;

/**
 * Lauryn
 */

public class ProfilePage extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final int SELECTED_PIC=1;
    ImageView imageView;
    private Spinner learning_dropdown;
    private Spinner proficient_dropdown;
    private static final String[]languages ={"Java", "R", "Ruby","Pearl","Matlab", "Html"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilepage);


        imageView = (ImageView)findViewById(R.id.imageView);


    }
    public void btnClick(View v){
        Intent intent = new Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent,SELECTED_PIC);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode) {
            case SELECTED_PIC:
                if (resultCode == RESULT_OK) {
                    Uri uri = data.getData();
                    String[] projection = {MediaStore.Images.Media.DATA};
                    Cursor cursor = getContentResolver().query(uri, projection,null, null, null);
                    cursor.moveToFirst();
                    int columnIndex = cursor.getColumnIndex(projection[0]);
                    String filepath = cursor.getString(columnIndex);
                    cursor.close();

                    Bitmap bitmap = BitmapFactory.decodeFile(filepath);
                    Drawable drawable = new BitmapDrawable(bitmap);
                    imageView.setBackground(drawable);


                }
                break;
                    default:
                break;


        }
        Spinner dropdown1 = findViewById(R.id.learning);
        String[] items1 = new String[]{"I am learning...", "Java", "R", "Ruby","Pearl","Matlab", "Html"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, languages);
        dropdown1.setAdapter(adapter1);

        Spinner dropdown2 = findViewById(R.id.proficient);
        String[] items2 = new String[]{"I am proficient in...", "Java", "R", "Ruby","Pearl","Matlab", "Html"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, languages);
        dropdown2.setAdapter(adapter2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.chat:
                startActivity(new Intent(this, MainActivity.class));
                finish();
                return true;
            case R.id.sign_out_menu:
                //mFirebaseAuth.signOut();
                //Auth.GoogleSignInApi.signOut(mGoogleApiClient);
                //mUsername = ANONYMOUS;
                startActivity(new Intent(this, SignInActivity.class));
                finish();
                return true;
            case R.id.profile:
                this.startActivity( new Intent (this, ProfilePage.class));
                finish();
                return true;
            case R.id.search:
                this.startActivity(new Intent (this, SearchPage.class));
                finish();
                return true;
            //case R.id.nav:
                //this.startActivity(new Intent(this, SearchPage.class));
                //return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}