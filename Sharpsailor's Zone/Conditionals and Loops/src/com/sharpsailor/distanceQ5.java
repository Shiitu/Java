package com.sharpsailor;
import java.util.Scanner;
public class distanceQ5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter The X points");
        int x1= sc.nextInt();
        int x2= sc.nextInt();
        System.out.println("enter The Y points");
        int y1= sc.nextInt();
        int y2= sc.nextInt();
        float distance= (float)(Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))));
        System.out.println(distance);
    }
}
