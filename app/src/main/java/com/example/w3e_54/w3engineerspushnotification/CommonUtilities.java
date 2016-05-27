package com.example.w3e_54.w3engineerspushnotification;

import android.content.Context;
import android.content.Intent;

/**
 * Created by w3e-54 on 1/12/16.
 */
public class CommonUtilities {

    // give your server registration url here
    static final String SERVER_URL = "http://gcm-android.orgfree.com/register.php";

    // Google project id
    static final String SENDER_ID = "139607140866";

    /**
     * Tag used on log messages.
     */
    static final String TAG = "W3Engineers GCM";

    static final String DISPLAY_MESSAGE_ACTION =
            "com.example.w3e_54.w3engineerspushnotification.DISPLAY_MESSAGE";

    static final String EXTRA_MESSAGE = "message";

    /**
     * Notifies UI to display a message.
     * <p>
     * This method is defined in the common helper because it's used both by
     * the UI and the background service.
     *
     * @param context application's context.
     * @param message message to be displayed.
     */
    static void displayMessage(Context context, String message) {
        Intent intent = new Intent(DISPLAY_MESSAGE_ACTION);
        intent.putExtra(EXTRA_MESSAGE, message);
        context.sendBroadcast(intent);
    }
}


