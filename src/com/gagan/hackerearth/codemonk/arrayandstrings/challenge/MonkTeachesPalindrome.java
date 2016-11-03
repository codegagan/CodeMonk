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
public class MonkTeachesPalindrome {
    public static void main(String... args) throws Exception{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        
        for (int i = 0; i < T; i++) {
            String input =br.readLine();
            int length = input.length();
            if(isEven(length)){
                int mid =length/2;
                int first = mid;
                int second = mid+1;
                String firstPart = input.substring(0, first);
                String secondPart = input.substring(second-1, length);
                if(firstPart.equals(new StringBuilder(secondPart).reverse().toString())){
                    System.out.println("YES EVEN");
                }else{
                    System.out.println("NO");
                }
                
            }else{
                int mid =length/2;
                int first = mid;
                int second = mid+2;
                String firstPart = input.substring(0, first);
                String secondPart = input.substring(second-1, length);
                if(firstPart.equals(new StringBuilder(secondPart).reverse().toString())){
                    System.out.println("YES ODD");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
    
    private static boolean isEven(int value){
        return (value%2 ==0);
    }
}
