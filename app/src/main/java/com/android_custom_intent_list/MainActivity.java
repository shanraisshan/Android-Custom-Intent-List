package com.android_custom_intent_list;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;

/**
 * Shayan Rais (http://shanraisshan.com)
 * created on 4/21/2016.
 */
public class MainActivity extends AppCompatActivity {

    final int REQUEST_CODE_WALLPAPER = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtn(View view) {
        //display the custom intent list on button click
        showCustomIntentList();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == REQUEST_CODE_WALLPAPER) {
                //Place your logic here
                Toast.makeText(MainActivity.this, "Some option selected", Toast.LENGTH_SHORT).show();
            }
        }

    }

    //______________________________________________________________________________________________
    void showCustomIntentList() {
        final ArrayList<Intent> intentList = new ArrayList<>();
        //default
        Intent i1 = new Intent(Constants.WALLPAPER_DEFAULT_ACTION);
        i1.setComponent(new ComponentName(this, Constants.WALLPAPER_DEFAULT_PACKAGE_NAME));
        intentList.add(i1);
        //none
        Intent i2 = new Intent(Constants.WALLPAPER_NONE_ACTION);
        i2.setComponent(new ComponentName(this, Constants.WALLPAPER_NONE_PACKAGE_NAME));
        intentList.add(i2);
        //library
        Intent i3 = new Intent(Constants.WALLPAPER_FROM_LIBRARY_ACTION);
        i3.setComponent(new ComponentName(this, Constants.WALLPAPER_FROM_LIBRARY_PACKAGE_NAME));
        intentList.add(i3);
        //gallery
        Intent i4 = new Intent(Constants.WALLPAPER_FROM_GALLERY_ACTION);
        i4.setComponent(new ComponentName(this, Constants.WALLPAPER_FROM_GALLERY_PACKAGE_NAME));
        intentList.add(i4);
        //solid color
        Intent i5 = new Intent(Constants.WALLPAPER_FROM_SOLID_COLOR_ACTION);
        i5.setComponent(new ComponentName(this, Constants.WALLPAPER_FROM_SOLID_COLOR_PACKAGE_NAME));
        intentList.add(i5);
        //....
        if(intentList.isEmpty())
            Toast.makeText(this, "No apps can perform this action", Toast.LENGTH_LONG).show();
        else {
            final Intent chooserIntent = Intent.createChooser(intentList.remove(intentList.size()-1), "Wallpaper");//this removes 'Always' & 'Only once' buttons
            chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentList.toArray(new Parcelable[intentList.size()]));
            startActivityForResult(chooserIntent, REQUEST_CODE_WALLPAPER);
        }
    }
}
