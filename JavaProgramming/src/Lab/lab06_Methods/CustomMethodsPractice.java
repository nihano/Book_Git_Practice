package Lab.lab06_Methods;

import org.w3c.dom.ls.LSOutput;

public class CustomMethodsPractice {

    public static void main(String[] args) {
        String str1 = helloName("James");

        System.out.println(helloName("James"));

        System.out.println("---------------------------------");

        System.out.println(makeAbba("Hi", "Bye"));

        System.out.println("---------------------------------");

        System.out.println(extandEnd("Hello"));



    }




    public static String helloName(String name) {
       return  "Hello " + name+"!";
    }

    public static String makeAbba(String a, String b){
        String result = "";
        result = a+b+b+a;
        return result;
    }

    public static String extandEnd(String str){
        if (str.length()<2){
            return str;
        }

        String substring = str.substring(str.length()-2); // last 2 characters of the string
        String result = substring.repeat(3); // repeats the substring 3 times
        return result;
    }






}
/*
1. Create a method that accepts 1 string, e.g. "Bob", return a greeting of the form "Hello
Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"

2. Create a method that accepts two strings, a and b, return the result of putting them
together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"

3. Create a method return a new string made of 3 copies of the last 2 chars of the original
string. The string length will be at least 2.

extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
 */