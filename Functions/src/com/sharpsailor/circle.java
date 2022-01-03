package com.sharpsailor;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius for the circle ");
        float radius=sc.nextFloat();
        inCircle( radius);
    }
     public static void inCircle(float radius){
        float circumference = (float)(2*3.14*radius);
        float area = (float)(3.14*radius*radius);
         System.out.println("The Circumference is "+circumference);
         System.out.println("The area is "+area);
    }
}

