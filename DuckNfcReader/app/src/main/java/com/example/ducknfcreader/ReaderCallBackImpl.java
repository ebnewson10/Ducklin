package com.example.ducknfcreader;

import android.nfc.NfcAdapter;
import android.nfc.Tag;

public class ReaderCallBackImpl implements NfcAdapter.ReaderCallback {
    @Override
    public void onTagDiscovered(Tag tag) {
        throw new UnsupportedOperationException("Declan");
    }
}
