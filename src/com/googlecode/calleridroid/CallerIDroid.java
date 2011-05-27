package com.googlecode.calleridroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class CallerIDroid extends BroadcastReceiver {
    
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(TelephonyManager.ACTION_PHONE_STATE_CHANGED)) {
            if (intent.getStringExtra(TelephonyManager.EXTRA_STATE).equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                Toast.makeText(context, "You are receiving a phone call from " + intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER), Toast.LENGTH_LONG).show();
            }
        }
    }
    
}
