package com.rmit.s3574966.assignment1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private SeekBar seekBar_red;
    private SeekBar seekBar_green;
    private SeekBar seekBar_blue;

    private EditText et_red;
    private EditText et_green;
    private EditText et_blue;

    private ImageView iv_color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initial SeekBar
        seekBar_red = (SeekBar) findViewById(R.id.seekBar_red);
        seekBar_green = (SeekBar) findViewById(R.id.seekBar_green);
        seekBar_blue = (SeekBar) findViewById(R.id.seekBar_blue);

        // Initial EditText
        et_red = (EditText) findViewById(R.id.et_red);
        et_green = (EditText) findViewById(R.id.et_green);
        et_blue = (EditText) findViewById(R.id.et_blue);

        // Initial ImageView
        iv_color = (ImageView) findViewById(R.id.iv_color);

        // SeekBar RED
        seekBar_red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                long hexColor = Math.round(255.0 / 100 * progress);

//                Log.d(TAG, "RED: " + hexColor);

                et_red.setText(hexColor + "");

                // Update ImageView Color
                iv_color.setBackgroundColor(Color.rgb(Integer.parseInt(et_red.getText().toString()), Integer.parseInt(et_green.getText().toString()), Integer.parseInt(et_blue.getText().toString())));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        // SeekBar GREEN
        seekBar_green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                long hexColor = Math.round(255.0 / 100 * progress);

//                Log.d(TAG, "GREEN: " + hexColor);

                et_green.setText(hexColor + "");

                // Update ImageView Color
                iv_color.setBackgroundColor(Color.rgb(Integer.parseInt(et_red.getText().toString()), Integer.parseInt(et_green.getText().toString()), Integer.parseInt(et_blue.getText().toString())));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        // SeekBar BLUE
        seekBar_blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                long hexColor = Math.round(255.0 / 100 * progress);

//                Log.d(TAG, "BLUE: " + hexColor);

                et_blue.setText(hexColor + "");

                // Update ImageView Color
                iv_color.setBackgroundColor(Color.rgb(Integer.parseInt(et_red.getText().toString()), Integer.parseInt(et_green.getText().toString()), Integer.parseInt(et_blue.getText().toString())));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        iv_color.setBackgroundColor(Color.rgb(0, 0, 0));

        Log.d(TAG, "onCreated - End");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.popup, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.pu_login) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.pu_register) {
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
            return true;
        }



        return super.onOptionsItemSelected(item);
    }

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
