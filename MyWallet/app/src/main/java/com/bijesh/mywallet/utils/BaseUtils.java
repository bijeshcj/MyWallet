package com.bijesh.mywallet.utils;

/**
 * Created by Bijesh on 12-02-2015.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * Contains utility methods for launching activities and fragments
 */
public class BaseUtils {

    /**
     * Method for launching an activity
     * @param context
     * @param activityClass
     */
    public static void launchActivity(Context context,Class<? extends Activity> activityClass){
        Intent intent = new Intent(context,activityClass);
        context.startActivity(intent);
    }
}
