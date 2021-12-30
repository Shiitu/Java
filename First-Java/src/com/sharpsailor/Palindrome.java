package com.sharpsailor;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        To find out whether the given String is Palindrome or not.
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        String rev="";
        for(int i =name.length()-1;i>=0;i--){
            rev += name.charAt(i);
        }
            System.out.println(rev);
       if(name.equals(rev)) {
           System.out.println(name+"  is a Palindrome");
       }else {
           System.out.println(name+" is not a Palindrome");
       }

    }
}

