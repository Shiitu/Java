package com.sharpsailor;
import java.util.Scanner;
public class factors {
    //    Input a number and print all the factors of that number (use loops).
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact= fact*i;
        }
        System.out.println("The factorial is "+fact);
    }
}
