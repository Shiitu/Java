package com.sharpsailor;

import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter amount in rupees");
        float i=sc.nextFloat();
        float usd= (float)0.013*i;
        System.out.println("the amount in USD is  "+usd);


    }
}
