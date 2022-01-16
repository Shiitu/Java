package com.sharpsailor;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the principle amount ");
        float principle = sc.nextFloat();
        System.out.println("Enter the rate ");
        float rate = sc.nextFloat();
        System.out.println("Enter the time in months   ");
        float time = sc.nextFloat();
        float si = principle*time*(rate/100);
        System.out.println("The Simple Interest is "+si  );
    }
}
