package com.example.ducknfcreader;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.Tag;

public class NfcTracker {
    private NfcAdapter nfcAdapter;
    private PendingIntent pendingIntent;
    private Context context;

    public NfcTracker(Context context) {
        this.context = context;
    }

    public NfcAdapter getNfcAdapter() {
        return nfcAdapter;
    }

    public void setNfcAdapter(NfcAdapter nfcAdapter) {
        this.nfcAdapter = nfcAdapter;
    }

    public PendingIntent getPendingIntent() {
        return pendingIntent;
    }

    public void setPendingIntent(PendingIntent pendingIntent) {
        this.pendingIntent = pendingIntent;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
