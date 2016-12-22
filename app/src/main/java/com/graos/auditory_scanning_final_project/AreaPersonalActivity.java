package com.graos.auditory_scanning_final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class AreaPersonalActivity extends AppCompatActivity {

    TextView user_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_personal);

        user_view = (TextView) findViewById(R.id.textViewHiUser);

        Intent i_result = getIntent();
        String user = i_result.getStringExtra("USER_REGISTER");
        String pass = i_result.getStringExtra("PASS_REGISTER");
        user_view.setText(user);
        Toast.makeText(this,"pass: "+pass,Toast.LENGTH_SHORT).show();
    }
}