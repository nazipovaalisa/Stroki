package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String str1 = "абвгдеёжз";
        String str2 = "абвгдеёжз";
        System.out.println(compare(str1, str2));
        String s1 ="blackcacatca";
        String s2 = "cat";
        System.out.println(task2(s1,s2));
        String s3 = "stylists imagination fghhgf ";
        System.out.println(task3(s3));
        String s4 = "анна did mom alfred alisa";
        System.out.println(palindrom(s4));

    }
    static Boolean compare(String s1,String s2){
        if (s1.length() != s2.length())
            return false;
        else{
            for (int i=0; i<s1.length(); i++){
                if(s1.charAt(i) != s2.charAt(i))
                    return false;
            }
            return true;
        }
    }
    static Boolean task2(String s1, String s2){
        if(s1.length() == s2.length())
            return compare(s1,s2);
        else if(s1.length()<s2.length())
            return find(s1,s2);
        else
            return find(s2,s1);
    }
    static Boolean find(String s1, String s2){
        int j = 0;
        int i = 0;
        Boolean flag = false;
        while (i<s2.length()){
            if(s2.charAt(i)==s1.charAt(j)){
                flag = true;
                j++;
                i++;
            }
            else if(flag){
                j=0;
                flag = false;
            }
            else {
                j = 0;
                i++;
                flag = false;
            }
            if(j == s1.length())
                return true;
        }
        return false;
    }
    static String task3(String s){
        String[] str = s.split(" ");
        String res = "";
        for(int i=0; i<str.length; i++){
            if(str[i].charAt(0)==str[i].charAt(str[i].length()-1))
                res = String.join(" ",str[i], res);
        }
        return res;
    }
    static int palindrom(String s){
        int count = 0;
        String[] str = s.split(" ");
        for (int i = 0; i<str.length; i++){
            StringBuffer s1 = new StringBuffer(str[i]);
            if(str[i].compareTo(s1.reverse().toString())==0)
                count++;
        }
        return count;
    }
}
