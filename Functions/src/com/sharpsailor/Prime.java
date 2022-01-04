package com.sharpsailor;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        inPrime(a);
    }
    public static void  inPrime(int a ){
        int temp = 0;
        for (int i =2; i<=a-1;i++){
            if (a%i==0){
                 temp+=1;
            }
        }
        if(temp==0){
                System.out.println(a+" is not a prime number ");
        }
        else {
                System.out.println(a+" is not a prime number");
        }
    }
}
