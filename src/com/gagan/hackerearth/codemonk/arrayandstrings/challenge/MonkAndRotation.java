/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gagan.hackerearth.codemonk.arrayandstrings.challenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gagssing
 */
public class MonkAndRotation {
    public static void main(String... args) throws Exception{
        
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        //Scanner
        Scanner s = new Scanner(br);
        
        for (int i = 0; i < T; i++) {
            int N =s.nextInt();
            int K =s.nextInt();
            
            //int[] array = new int[N];
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<N;j++){
                //array[j]= s.nextInt();
                list.add(s.nextInt());
            }
            //int [] finalArray = new int[N];
            
            
            Collections.rotate(list, K);
            
            for(Integer a : list){
                System.out.print(a+" ");
            }
           System.out.println();
            
        }
    }
    
    
}

/*

        
*/
