package com.gagan.hackerearth.codemonk.sorting.practice;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by gagssing on 11/4/2016.
 */
public class BubbleSort {
    public static void main(String... args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);

        //Scanner
        Scanner s = new Scanner(br);

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i]=s.nextInt();
        }

        int arrayLength = array.length;
        int swaps=0;
        int temp;
        for(int i=0;i<arrayLength-1;i++){
            for(int j =0 ; j<arrayLength-i-1;j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j]= array[j+1];
                    array[j+1]=temp;
                    swaps++;
                }
            }
        }


        System.out.println(swaps);

    }
}
