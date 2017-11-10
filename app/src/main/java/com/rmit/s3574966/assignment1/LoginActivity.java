package com.rmit.s3574966.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";

    private EditText et_email;
    private EditText et_password;

    private CheckBox cb_remember;
    private Switch swt_autologin;

    private Button btn_login;
    private Button btn_register;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initial EditText
        et_email = (EditText) findViewById(R.id.et_email_login);
        et_password = (EditText) findViewById(R.id.et_password_login);

        // Initial Checkbox
        cb_remember = (CheckBox) findViewById(R.id.cb_remember);

        // Initial Switch
        swt_autologin = (Switch) findViewById(R.id.swt_autologin);

        // Initial Button
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_register = (Button) findViewById(R.id.btn_register);

        Log.d(TAG, "onCreate");

    }

    public void onClickRegister(View view){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);

        Log.d(TAG, "onClickRegister");
    }

    public void onClickLogin(View view){
        // Get value
        String mEmail = et_email.getText().toString();
        String mPassword = et_password.getText().toString();

        // Log check value
        Log.d(TAG, "Email: " + mEmail);
        Log.d(TAG, "Password: " + mPassword);

//        Toast.makeText(this, "LoginButton Clicked", Toast.LENGTH_SHORT).show();


        //Users users = new Users(mEmail, mPassword);

        // Check Remember this account
        if(cb_remember.isChecked()){
            // TODO Retrieve and save account if remember is checked

            Toast.makeText(this, "Remember this account - checked", Toast.LENGTH_SHORT).show();
        }

        // Check auto-login
        if(swt_autologin.isChecked()){
            // TODO: Save state

            Toast.makeText(this, "Auto-login is ON", Toast.LENGTH_SHORT).show();
        }

        // Check email and password
        if(mEmail.equals("abc@gmail.com") && mPassword.equals("123456")){
            // TODO: Retrieve from database

            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "Login Successful");
        } else {
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "Login Failed");
        }

        // End onClickLogin
        Log.d(TAG, "onClickLogin - End");


    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.popup, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.pu_register) {
//            Intent intent = new Intent(this, RegisterActivity.class);
//            startActivity(intent);
//            return true;
//        }
//        if (id == R.id.pu_colortesting) {
//            Intent intent = new Intent(this, MainActivity.class);
//            startActivity(intent);
//            return true;
//        }
//
//
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }
}
