package com.decathlon.bae.bae;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpResponse;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.net.*;
import java.io.*;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by Ashutosh on 06/12/2017.
 */

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actitvity_login);

        Button but = (Button)findViewById(R.id.button);

        final String url ="http://localhost:3000/api/search";

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



             }



         });
    }
}