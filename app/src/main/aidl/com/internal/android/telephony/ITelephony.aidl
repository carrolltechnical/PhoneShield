// ITelephony.aidl
package com.internal.android.telephony;

// Declare any non-default types here with import statements

interface ITelephony {

boolean endCall();

void answerRingingCall();

//apparently silenceRinger is no longer valid
//void silenceRinger();

}
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
