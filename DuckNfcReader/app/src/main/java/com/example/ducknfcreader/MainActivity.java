package com.example.ducknfcreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String ERROR_DETECTED = "AH";
    public static final String CONNECTION_SUCCESS = "AH";
    private TextView output;
    private Button readNfcButton;
    private NfcTracker nfcTracker;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nfcTracker = new NfcTracker(this);
        output = findViewById(R.id.OutputText);
        readNfcButton = findViewById(R.id.ReadButton);
        readNfcButton.setOnClickListener(new ButtonOnClickListener(nfcTracker, this));
        Intent intent = new Intent();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (NfcAdapter.ACTION_NDEF_DISCOVERED.equals(intent.getAction())) {
            Tag myTag = intent.getParcelableExtra(NfcAdapter.EXTRA_TAG);
            nfcTracker.setMyTag(myTag);
        }
    }

    public Intent getStupidIntent() {
        return getIntent();
    }
}