package com.example.advancesoftwareprocessproject;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
//    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.home);
//        button3 = (Button) findViewById(R.id.button3);
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                start();
//            }
//        });
    }

    public void start(View view){
        Intent intent = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(intent);
    }
}