package com.android_custom_intent_list;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Shayan Rais (http://shanraisshan.com)
 * created on 4/21/2016.
 */
public class Wallpaper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);

        if(getIntent() != null)
            if(getIntent().getAction() != null) {
                String action = getIntent().getAction();
                if(action.equals(Constants.WALLPAPER_DEFAULT_ACTION)) {
                    Toast.makeText(this, "Set the default wallpaper - Logic here", Toast.LENGTH_SHORT).show();
                    setResult(RESULT_OK, new Intent());
                    finish();
                } else if(action.equals(Constants.WALLPAPER_NONE_ACTION)) {
                    Toast.makeText(this, "Clear the wallpaper - Logic here", Toast.LENGTH_SHORT).show();
                    setResult(RESULT_OK, new Intent());
                    finish();
                } else if(action.equals(Constants.WALLPAPER_FROM_SOLID_COLOR_ACTION)) {
                    Toast.makeText(this, "Set the solid color - Logic here", Toast.LENGTH_SHORT).show();
                    setResult(RESULT_OK, new Intent());
                    finish();
                } else if(action.equals(Constants.WALLPAPER_FROM_GALLERY_ACTION)) {
                    setResult(RESULT_OK, new Intent());
                    Toast.makeText(this, "Set the wallpaper from gallery - Logic here", Toast.LENGTH_SHORT).show();
                    finish();
                } else if(action.equals(Constants.WALLPAPER_FROM_LIBRARY_ACTION)) {
                    Toast.makeText(this, "This is wallpaper library activity", Toast.LENGTH_SHORT).show();
                }
            }
    }
}
