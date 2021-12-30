import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any number");
        int no = sc.nextInt();
        int t1= no;
        int length=0;
        while (t1!=0){
            length++;
            t1 /= 10;
        }
        int t2 = no;
        int arm= 0;
        while (t2!=0){
            int mul =1;
            int rem = t2 % 10;
            for (int i=1;i<=length;i++){
                mul *= rem;
            }
            arm =arm + mul;
            t2/=10;
        }
        if (arm==no){
            System.out.println(no+"  is a armstrong number");
        }else {
            System.out.println(no+"  is not an armstrong number");
        }
    }
}
