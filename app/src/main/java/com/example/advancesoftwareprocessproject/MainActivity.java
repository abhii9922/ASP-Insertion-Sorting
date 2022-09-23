package com.example.advancesoftwareprocessproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inputText;
    TextView textview;
    Button button1;
    int flag = 0;
    int flag2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = (EditText) findViewById(R.id.inputText);
        textview = (TextView) findViewById(R.id.textView);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result();
            }
        });
    }

    public void result(){
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        Intent intent1 = new Intent(MainActivity.this, SecondActivity.class);

        String input = inputText.getText().toString();

        if(TextUtils.isEmpty(input)){
            Toast.makeText(MainActivity.this, "No Empty Field Allowed.", Toast.LENGTH_SHORT).show();
//            System.out.println("Hiii");
        }
        else{
            String[] inputs = input.split(",");

            if(inputs.length<2){
                Toast.makeText(MainActivity.this, "Minimum 2 values are required", Toast.LENGTH_SHORT).show();
            }
            else if(inputs.length>8){
                Toast.makeText(MainActivity.this, "Maximum 8 values are allowed", Toast.LENGTH_SHORT).show();
            }
            else {

                for(int i=0; i< inputs.length;i++){
                    if(!TextUtils.isDigitsOnly(inputs[i])){
                        flag = 1;
                        Toast.makeText(MainActivity.this, "Only numerical values are allowed", Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                    }
                }

                if(flag==0){
                int inputArray[] = new int[inputs.length];

                    for (int i = 0; i < inputs.length; i++) {
                        int i1 = Integer.parseInt(inputs[i]);
                        inputArray[i] = i1;
                        //System.out.println(inputArray[i]);
                    }

                for(int i=0; i<inputArray.length;i++){
//                    System.out.println("Hii loop");
                    System.out.println(inputArray[i]);
                    if(inputArray[i]<0 || inputArray[i]>9){
                        flag2 = 1;
//                        System.out.println("Hii Hello");
                        Toast.makeText(MainActivity.this, "Please enter numerical values between 0-9", Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                    }
                }

                if(flag2 == 0){
//                    System.out.println("Hii");
                    intent1.putExtra("Inputs", inputArray);
                    startActivity(intent1);
                }

                }
            }

        }

    }

    public void quit(View view){
        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}