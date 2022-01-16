package com.sharpsailor;

import java.util.Scanner;

public class Min_max {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First number ");
        int First =sc.nextInt();
        System.out.println("Enter the Second number ");
        int Second =sc.nextInt();
        System.out.println("Enter the Third number ");
        int Third =sc.nextInt();
        int Largest = Largest(First, Second, Third);
        int Smallest = Smallest(First, Second, Third);
        System.out.printf("The largest of three Numbers is %d,%d, and %d is :%d %n" ,First,Second,Third,Largest );
        System.out.printf("The smallest of three Numbers is %d,%d, and %d is :%d %n" ,First,Second,Third,Smallest );
    }
    public static int Largest (int First, int Second, int Third){
        int maximum = First;
        if(Second >maximum){
            maximum = Second;
        }
        if(Third >maximum){
            maximum = Third;
        }
        return maximum;

    }
    public static int Smallest (int First, int Second, int Third){
        int minimum = First;
        if(Second <minimum){
            minimum = Second;
        }
        if(Third <minimum){
            minimum = Third;
        }
        return minimum;
    }

}
