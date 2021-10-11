package com.example.ducknfcreader;


import android.app.PendingIntent;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Parcelable;
import android.view.View;

public class ButtonOnClickListener implements View.OnClickListener {

    private NfcTracker nfcTracker;
    private MainActivity IHateThisVar;

    public ButtonOnClickListener(NfcTracker nfcTracker, MainActivity iHateThisVar) {
        this.nfcTracker = nfcTracker;
        IHateThisVar = iHateThisVar;
    }

    @Override
    public void onClick(View v) {


        readFromIntent(IHateThisVar.getStupidIntent());
        Intent intentAh = new Intent(IHateThisVar, IHateThisVar.getClass());
        PendingIntent intent = PendingIntent.getActivity(nfcTracker.getContext(), 0, intentAh.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP), 0);
        nfcTracker.setPendingIntent(intent);

    }

    private void readFromIntent(Intent intent) {
        String action = intent.getAction();
        NfcAdapter nfcAdapter = nfcTracker.getNfcAdapter();
        if(NfcAdapter.ACTION_NDEF_DISCOVERED.equals(action) || NfcAdapter.ACTION_TAG_DISCOVERED.equals(action) || NfcAdapter.ACTION_TECH_DISCOVERED.equals(action)) {
            Tag tag = intent.getParcelableExtra(NfcAdapter.EXTRA_NDEF_MESSAGES);
        }
    }


}
