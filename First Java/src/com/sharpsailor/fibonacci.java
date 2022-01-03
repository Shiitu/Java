package com.sharpsailor;

import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
//        To calculate Fibonacci Series up to n numbers.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nth number");
        int n =  sc.nextInt();
        int a = 0,b=1;
        System.out.print(a+" "+b);
        for (int i=0; i<=n;i++ ){
            int c= a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
