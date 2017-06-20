package io.github.andhikayuana.lib.util;

import android.util.Log;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 6/12/17
 */

public class LogUtil {

    public static final String TAG = "YuanaCore";

    // TODO: 6/12/17 logging something

    public static void d(String msg) {
        Log.d(TAG, msg);
    }

    public static void v(String msg) {
        Log.v(TAG, msg);
    }

    public static void e(String msg) {
        Log.e(TAG, msg);
    }

    public static void w(String msg) {
        Log.w(TAG, msg);
    }

    public static void i(String msg) {
        Log.i(TAG, msg);
    }

}
