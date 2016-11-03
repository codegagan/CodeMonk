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
public class LittleMonkAndGoodString {
    
    public static void main(String... args) throws Exception{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int length=0;
        int currentLength=0;
        StringBuilder sb = new StringBuilder();
        for(char input :line.toCharArray()){
            if(isVovel(input)){
                sb.append(String.valueOf(input));
                currentLength+=1;
            }else{
                currentLength=0;
            }
            
            if(currentLength>length){
                length=currentLength;
            }
        }
        System.out.println(length);
    }
    
    private static boolean isVovel(char value){
        return ("aeiou".contains(String.valueOf(value)));
    }
}
