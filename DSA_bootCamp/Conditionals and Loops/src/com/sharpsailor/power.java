package com.sharpsailor;
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x= sc.nextDouble();
        double y= sc.nextDouble();
        System.out.println("The Answer is "+ Math.pow(x, y));
    }
}
