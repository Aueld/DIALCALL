package com.example.dialcalldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mCall;
    private Button mDialogCall;
    private EditText mEditNumber;
    private String mNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCall = (Button) findViewById(R.id.btnCall);
        mDialogCall = (Button) findViewById(R.id.btnDialog);
        mEditNumber = (EditText) findViewById(R.id.edtNumber);

        String tel = "tel:" + mNum;

        mCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent("android.intent.action.CALL", Uri.parse(tel)));
            }
        });
        mDialogCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel)));
            }
        });
    }

}