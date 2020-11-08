package com.theviciousgames.refreshratechecker;

import android.app.Activity;
import android.content.Context;
import android.os.Vibrator;

public class Tools {
    public static class Utils
    {
        public static String getRefreshRate(Activity activity)
        {
            String rateVal=Screen.RefreshRate.getRefreshRate(activity);

            return rateVal;
        }

        public static void vibrate(Context context)
        {
            Vibrator v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
            v.vibrate(50);
        }
    }
}
