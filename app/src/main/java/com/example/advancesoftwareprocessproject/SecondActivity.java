package com.example.advancesoftwareprocessproject;
import java.util.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class SecondActivity extends AppCompatActivity {

    TextView text;
    String str="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        text = (TextView) findViewById(R.id.textView1);

        int[] Inputs = getIntent().getIntArrayExtra("Inputs");

        //Arrays.sort(Inputs);

        for(int i=0; i<Inputs.length;i++){
            System.out.println(Inputs[i]);
        }

//        int input[] = getIntent().getStringExtra("key");
//
        this.insertionSort2(Inputs);
        text.setText(str);
    }
    public void print(int[] arr){
        for(int x: arr){
            this.str += x +" ";
            System.out.print(x +"   ");
        }
        this.str +="\n";
        this.str +="\n";
        System.out.println();
    }
    public void insertionSort2(int[] arr) {
        print(arr);
        for(int i= 1; i<arr.length; ++i){
            int key = arr[i];
            int j = i-1;

            boolean flag = false;

            while(j>=0 && arr[j]>key){
                //print(arr);
                flag = true;
                arr[j+1]=arr[j];
                j = j-1;
            }
            arr[j+1]=key;
            if(flag)
                print(arr);
        }
    }
    public void quit(View view){
        Intent intent = new Intent(SecondActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}