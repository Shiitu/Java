package com.sharpsailor;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number 1");
        int x= sc.nextInt();
        System.out.println("enter the number 2");
        int y= sc.nextInt();
        if (x > y) {
            System.out.println(x+" is the largest of both");
        }else {
            System.out.println(y+" is the largest of both");
        }

    }
}

