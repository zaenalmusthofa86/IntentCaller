package com.zaenal.intentcallerzaenal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentCaller2Activity extends Activity implements View.OnClickListener {

    public Button button2;
    public EditText editT;

    public String ACTION_CHECK ="com.zaenal.intentcallerzaenal.ACTION_CHECK";

    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_intent);
        button2=(Button)findViewById(R.id.button1);
        editT=(EditText)findViewById(R.id.editText1);
        button2.setOnClickListener(this);
    }
    @Override
    public void onClick(View arg0){
        int startSelection, andSelection;
        if (arg0==button2) {
            startSelection=editT.getSelectionStart();
            andSelection=editT.getSelectionEnd();
            //String selectedText = editT.getText().toString().substring(startSelection,andSelection);
            //Intent intent=new Intent();
            //intent.setAction(ACTION_CHECK);
            //intent.putExtra("word",selectedText);
            //startActivity(intent);
            //-----------------------------------------------------------
            //String url = "http://www.instagram.com/zae.nall_";
            //Intent web = new Intent(Intent.ACTION_VIEW);
            //web.setData(Uri.parse(url));
            //startActivity(web);
            //-----------------------------------------------------------
            //Intent intent = new Intent(Intent.ACTION_VIEW,
            //       Uri.parse("https://goo.gl/maps/Co1PJoBGiC4gNTf98"));
            //startActivity(intent);
            //-----------------------------------------------------------
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:081383306753"));
            startActivity(callIntent);
        }
    }
}
