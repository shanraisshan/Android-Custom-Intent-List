package com.android_custom_intent_list;

/**
 * Created by Shayan.Rais on 4/21/2016.
 */
public class Constants {
    //if you change here, change also in AndroidManifest.xml
    private static String p = "com.android_custom_intent_list";
    public final static String WALLPAPER_DEFAULT_ACTION         = p + ".intent.action.WALLPAPER_DEFAULT";
    public final static String WALLPAPER_NONE_ACTION            = p + ".intent.action.WALLPAPER_NONE";
    public final static String WALLPAPER_FROM_LIBRARY_ACTION    = p + ".intent.action.WALLPAPER_FROM_LIBRARY";
    public final static String WALLPAPER_FROM_GALLERY_ACTION    = p + ".intent.action.WALLPAPER_FROM_GALLERY";
    public final static String WALLPAPER_FROM_SOLID_COLOR_ACTION= p + ".intent.action.WALLPAPER_FROM_SOLID_COLOR";


    public final static String WALLPAPER_DEFAULT_PACKAGE_NAME           = p + ".WallpaperDefault";
    public final static String WALLPAPER_NONE_PACKAGE_NAME              = p + ".WallpaperNone";
    public final static String WALLPAPER_FROM_LIBRARY_PACKAGE_NAME      = p + ".Wallpaper";
    public final static String WALLPAPER_FROM_GALLERY_PACKAGE_NAME      = p + ".WallpaperGallery";
    public final static String WALLPAPER_FROM_SOLID_COLOR_PACKAGE_NAME  = p + ".WallpaperColor";
}
