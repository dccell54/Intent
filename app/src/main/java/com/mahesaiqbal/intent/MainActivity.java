package com.mahesaiqbal.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //EditText
        final EditText number=(EditText)findViewById(R.id.no_telp);
        Button dial=(Button)findViewById(R.id.panggil);
        //ketika menekan tombol call maka akan melakukan dial
        dial.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                //number = inputan dari editText
                String toDial="tel:"+number.getText().toString();

                startActivity(new Intent(Intent.ACTION_DIAL,Uri.parse(toDial)));
            }
        });

    }
}
