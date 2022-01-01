import java.util.Scanner;
public class Depreciation {
    public static void main(String[] args) {
        long amount ,Depreciation,time ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount");
        amount = sc.nextLong();
        System.out.println("Enter Depreciation percentage ");
        Depreciation= sc.nextLong();
        System.out.println("Enter the time in Year");
        time = sc.nextLong();
        long temp=amount;
        for(int i=0;i<time;i++){
            temp=((100-Depreciation)*temp)/100;
            System.out.println("depreciation "+temp);
        }

    }
}
