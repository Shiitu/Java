package com.sharpsailor;

import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        int n1= sc.nextInt();
        System.out.println("Enter the Second number");
        int n2= sc.nextInt();
        inmultiply(n1,n2);
    }
    public static void inmultiply(int n1, int n2) {
        int product=1;
        product=n1 * n2;
        System.out.println("The sum of the numbers is : "+product);
    }
}
