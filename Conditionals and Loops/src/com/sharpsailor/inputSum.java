package com.sharpsailor;
import java.util.Scanner;

public class inputSum {
    //    Take integer inputs till the user enters 0 and print the sum of all numbers.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int n;
        System.out.println("Enter the number ");
        do{
            n =sc.nextInt();
            sum =sum + n;
        }while (n != 0) ;
        System.out.print(sum+" is the sum ");
    }

}
