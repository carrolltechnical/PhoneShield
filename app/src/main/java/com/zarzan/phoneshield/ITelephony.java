package com.zarzan.phoneshield;

import android.content.Context;

/**
 * Created by Master Drew on 12/7/2017.
 */

interface ITelephony {

    boolean endCall();

    void answerRingingCall();

    void silenceRinger();

}