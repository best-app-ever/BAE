package com.decathlon.bae.bae;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ashutosh on 23/11/2017.
 */

public class CustomerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
        Button button = (Button) findViewById(R.id.button4);
        //i have added a code here one more commetn
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerActivity.this,CreationActivity.class);
                startActivity(intent);
            }
        });
        Button button1 = (Button) findViewById(R.id.button5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(CustomerActivity.this,LoginActivity.class);
                startActivity(intent1);
            }
        });
    }
}
