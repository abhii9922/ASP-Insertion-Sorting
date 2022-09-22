package com.example.advancesoftwareprocessproject.util;

import java.util.ArrayList;
import java.util.List;

public class SortingProvider {

    public ArrayList<int[]> insertionSort2(int[] arr) {
        // print(arr);

        ArrayList<int[]> results = new ArrayList<int[]>();
        results.add(arr.clone());
        for(int i = 1; i < arr.length; ++i){
            int key = arr[i];
            int j = i - 1;

            boolean flag = false;

            while(j>=0 && arr[j]>key){
                //print(arr);
                flag = true;
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1]=key;
            if(flag)
                results.add(arr.clone());
        }

        return (results);

    }

}
