package com.theviciousgames.refreshratechecker;

import android.app.Activity;

public class Screen {

    public static class RefreshRate
    {
        public static String getRefreshRate(Activity activity)
        {
           String rateVal=activity.getWindowManager().getDefaultDisplay().getRefreshRate() + "";

           return rateVal;
        }
    }
}
