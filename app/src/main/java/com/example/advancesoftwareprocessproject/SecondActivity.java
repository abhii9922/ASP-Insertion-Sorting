package com.example.advancesoftwareprocessproject;
import java.util.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.advancesoftwareprocessproject.util.SortingProvider;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class SecondActivity extends AppCompatActivity {

    TextView text;
    String str="";

    SortingProvider sortingProvider;
    List<int[]> results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        sortingProvider = new SortingProvider();

        text = (TextView) findViewById(R.id.textView1);

        int[] Inputs = getIntent().getIntArrayExtra("Inputs");

        //Arrays.sort(Inputs);

        for(int i=0; i<Inputs.length;i++){
            System.out.println(Inputs[i]);
        }

//        int input[] = getIntent().getStringExtra("key");

        results = sortingProvider.insertionSort2(Inputs);
        for (int[] result: results) {
            this.print(result);
        }
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

    public void quit(View view){
        Intent intent = new Intent(SecondActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}