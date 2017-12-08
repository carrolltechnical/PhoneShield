package com.zarzan.phoneshield;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Log;
import android.widget.Toast;
import android.telephony.TelephonyManager;

/**
 * Created by Master Drew on 12/7/2017.
 */

public class PhoneStateReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            System.out.println("Receiver start");
            Toast.makeText(context," Receiver start ",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
