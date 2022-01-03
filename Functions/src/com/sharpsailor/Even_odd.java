package com.sharpsailor;

import java.util.Scanner;

public class Even_odd {
    // Define a program to find out whether a given number is even or odd.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        System.out.println(x + " is even: " + isEven(x));

    }
    private static boolean isEven(int x)
    {
        return(x %2)==0;

    }
}
