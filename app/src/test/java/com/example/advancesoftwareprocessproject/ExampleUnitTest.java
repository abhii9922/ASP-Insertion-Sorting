package com.example.advancesoftwareprocessproject;
import java.util.Scanner;
import org.junit.Test;
import java.io.*;
import java.util.*;
import com.example.advancesoftwareprocessproject.util.SortingProvider;

import java.util.ArrayList;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private SortingProvider sortingProvider;

    public void build() {
        this.sortingProvider = new SortingProvider();
    }

    public void teardown() {
        this.sortingProvider = null;
    }

    @Test
    //test case 1
    public void shouldSortValues() {

        this.build();
        //ArrayList<int[]> inputs = new ArrayList<int[]>();
        Scanner input = new Scanner(System.in);
        int n = 5;
        ArrayList<Integer> arrli
                = new ArrayList<>(n);
        int[] values = { 3, 4, 5, 0, 2 };
        //inputs.add(0,values);
        int number = 0;
        for (int i =0; i < values.length; i++){
            number = values[i];
            arrli.add(number);
        }

        System.out.println("Values given as input are :"+arrli);
        int [] arr = new int[arrli.size()];
        for(int i = 0; i< n ;i++){
            arr[i] = arrli.get(i);
            //System.out.println(arr[i]);
        }
        System.out.println("**************");
        int[] expectedOrder = { 0, 2, 3, 4 ,5 };
        //ArrayList<Integer> testResults = new ArrayList<Integer>();


        ArrayList<int[]> result = sortingProvider.insertionSort2(arr);

        for (int i=0; i<result.size(); i++){
            int[] tmp = result.get(i);
            for (int j=0; j<tmp.length; j++) {
                System.out.println(tmp[j]);
            }
            System.out.println("---");
        }



       // System.out.println("SORTED VALUES ARE ..."+sortingProvider.insertionSort2(values));
        /*for(int i = 0; i < inputs.size(); i++) {
            System.out.print(inputs.get(i));
        }*/
       // System.out.println("HELLO1 " +arr);

       // System.out.println("HELLO2 "+testResults.toArray());

     // assertArrayEquals(expectedOrder,object2);

        this.teardown();
    }
}