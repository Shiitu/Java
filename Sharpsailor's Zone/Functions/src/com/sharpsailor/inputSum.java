package com.sharpsailor;

import java.util.Scanner;

public class inputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        int n1= sc.nextInt();
        System.out.println("Enter the Second number");
        int n2= sc.nextInt();
        insum(n1,n2);
    }
    public static void insum(int n1, int n2) {
         int sum =0;
         sum=n1 + n2;
        System.out.println("The sum of the numbers is : "+sum);
    }
}
