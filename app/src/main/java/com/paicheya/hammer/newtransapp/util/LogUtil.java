package com.paicheya.hammer.newtransapp.util;

import android.util.Log;

/**
 * Created by hammer on 2016/1/25.
 */
public class LogUtil {
    public static boolean isDebug = true;
    public static void Debug(String str)
    {
        Log.d("Debug",str);
    }

    public static void Http(String paramString)
    {

        Log.d("http测试", paramString);
    }
}
