package com.decathlon.bae.bae;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpResponse;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.json.JSONObject;

import java.net.*;
import java.io.*;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by Ashutosh on 06/12/2017.
 */

public class LoginActivity extends Activity {
    private FirebaseAuth mAuth;
    private static final String TAG = "EmailPassword";

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();

    }

    public void signIn (String email , String password) {
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithEmail:successfully");
                            FirebaseUser user = mAuth.getCurrentUser();
                            String text = user.getEmail();
                            Toast.makeText(LoginActivity.this,text,
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithEmail:failure", task.getException());
                            String something = task.getException().toString();
                            Toast.makeText(LoginActivity.this, something,
                                    Toast.LENGTH_SHORT).show();

                        }

                        // ...
                    }
                });



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actitvity_login);
        mAuth = FirebaseAuth.getInstance();
        Button but = (Button)findViewById(R.id.button);


        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText email = (EditText)findViewById(R.id.editText);
                EditText password = (EditText)findViewById(R.id.editText2);
                onStart();
                String a = email.getText().toString();
                String b = password.getText().toString();
                signIn (a, b);

             }



         });
    }
}