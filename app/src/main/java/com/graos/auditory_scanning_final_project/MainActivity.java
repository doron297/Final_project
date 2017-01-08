package com.graos.auditory_scanning_final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText passLogIn;
    EditText userLogin;
    boolean cancel = false;
    View focusView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home Screen");
        //setTitleColor(ge);

//        passLogIn = (EditText) findViewById(R.id.editText_login_pass);
//        userLogin = (EditText) findViewById(R.id.editText_login_user);
}



    // ********** SIGN UP ***********

    public void press_signUp(View v){
        Intent i = new Intent(this, SignUpActivity.class);
        startActivity(i);
    }


    // ********** SIGN IN ***********
    public void press_signIn(View view) {

        String password = passLogIn.getText().toString();
        String user = userLogin.getText().toString();

        Toast.makeText(this,"pass: "+password,Toast.LENGTH_SHORT).show();

//        if (!isPasswordValid(password)) {
//            passLogIn.setError(getString(R.string.error_invalid_password));
//            focusView = passLogIn;
//            cancel = true;
//        }

//        Intent i = new Intent(this, AreaPersonalActivity.class);
//        startActivity(i);
    }



    private boolean isPasswordValid(String password) {
        return password.length() > 4;
    }

}
