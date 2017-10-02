package com.example.aj.call;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mob;
    ImageButton call, dial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mob = (EditText) findViewById(R.id.mob);
        call = (ImageButton) findViewById(R.id.call);
        dial = (ImageButton) findViewById(R.id.dial);
        call.setOnClickListener(this);
        dial.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent Int = null;
        String mobileno = mob.getText().toString();
        switch (v.getId()) {
            case R.id.call:
                Int = new Intent(Intent.ACTION_CALL);
                Int.setData(Uri.parse("tel:" + mobileno));
                break;
            case R.id.dial:
                Int = new Intent(Intent.ACTION_DIAL);
                Int.setData(Uri.parse("tel:" + mobileno));
                break;
        }
        if(Int!=null)startActivity(Int);
    }
}
