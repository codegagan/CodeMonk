/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gagan.hackerearth.codemonk.arrayandstrings.challenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author gagssing
 */
public class MonkAndWelcome {
    public static void main(String... args) throws Exception{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        //Scanner
        Scanner s = new Scanner(br);
        //int N = s.nextInt();
        int[] arrayA = new int[N];
        int[] arrayB = new int[N];
        for (int i = 0; i < N; i++) {
            arrayA[i] =s.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            arrayB[i] =s.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print((arrayA[i]+arrayB[i])+" ");
        }
        
    }
}
