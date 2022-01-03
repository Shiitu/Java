package com.sharpsailor;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        // Write a program to print whether a number is even or odd, also take input.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x= sc.nextInt();
        if(x%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
