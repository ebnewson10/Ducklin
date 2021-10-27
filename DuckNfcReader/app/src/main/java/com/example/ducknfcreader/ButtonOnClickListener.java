package com.example.ducknfcreader;


import android.app.PendingIntent;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;

public class ButtonOnClickListener implements View.OnClickListener {

    NfcTracker tracker;
    NfcAdapter adapter;

    public ButtonOnClickListener(NfcTracker tracker) {
        this.tracker = tracker;
    }

    @Override
    public void onClick(View v) {
        adapter = NfcAdapter.getDefaultAdapter(tracker.getContext());
    }
}
