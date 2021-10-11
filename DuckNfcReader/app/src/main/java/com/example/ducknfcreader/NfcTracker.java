package com.example.ducknfcreader;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.Tag;

public class NfcTracker {
    private NfcAdapter nfcAdapter;
    private PendingIntent pendingIntent;
    private IntentFilter writingTagFilters;
    private boolean writeMode;
    private Tag myTag;
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

    public IntentFilter getWritingTagFilters() {
        return writingTagFilters;
    }

    public void setWritingTagFilters(IntentFilter writingTagFilters) {
        this.writingTagFilters = writingTagFilters;
    }

    public boolean isWriteMode() {
        return writeMode;
    }

    public void setWriteMode(boolean writeMode) {
        this.writeMode = writeMode;
    }

    public Tag getMyTag() {
        return myTag;
    }

    public void setMyTag(Tag myTag) {
        this.myTag = myTag;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
