package com.sharpsailor;
import java.util.Scanner;
public class subtractProductAndSum {
    //    leetcode question :https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/submissions/
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int product = 1;
        int sum =0;
        while(n>0){
            product*=(n%10);
            sum+=(n%10);
            n/=10;
        }
        System.out.println(product-sum);
    }
}
