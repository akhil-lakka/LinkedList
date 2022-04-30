package com.example.linkedlist;

public class ReverseString {

    public static void main(String[] args){
        String s = "ABCDE";
        String s1 = "ABCDE";

        String ans = "";

        for(int i =s.length()-1 ;i>=0 ;i--){
            ans += s.charAt(i);
        }

        System.out.println(" reversed string = "+ans);
    }


}
