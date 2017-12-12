package com.zarzan.phoneshield;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.widget.Toast;
import android.telephony.TelephonyManager;
import android.telecom.Call;

import com.internal.android.telephony.ITelephony;

import java.lang.reflect.Method;

/**
 * Created by Master Drew on 12/7/2017.
 */

public class Landing extends BroadcastReceiver {
    private ITelephony telephonyService;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onReceive(Context context, Intent intent) {
        try {



            System.out.println("Receiver start");
            String incomingNumber = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
            String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
            Toast.makeText(context," Receiver start ",Toast.LENGTH_SHORT).show();







            if(state.equals(TelephonyManager.EXTRA_STATE_RINGING)){
                Toast.makeText(context,"Ringing State Number is -"+incomingNumber,Toast.LENGTH_SHORT).show();

//                Call telephonyManager = (Call) context.getSystemService(Context.TELEPHONY_SERVICE);
//                Class clazz = Class.forName(telephonyManager.getClass().getName());
//                Method method = clazz.getDeclaredMethod("getITelephony");
//                method.setAccessible(true);
//                Call telephonyService = (Call) method.invoke(telephonyManager);
//                telephonyManager.disconnect();
                Call dc = new Call();
                dc.disconnect();
                //telephonyService.endCall();
            }
            if ((state.equals(TelephonyManager.EXTRA_STATE_OFFHOOK))){
                Toast.makeText(context,"Received State",Toast.LENGTH_SHORT).show();
            }
            if (state.equals(TelephonyManager.EXTRA_STATE_IDLE)){
                Toast.makeText(context,"Idle State",Toast.LENGTH_SHORT).show();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
