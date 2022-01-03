package com.sharpsailor;

import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("The person is eligible for Voting : "+(voting(age)));

    }
    static boolean voting(int age ){
        if(age >=18){
            return true;
        }else{
            return false;
        }
    }
}
