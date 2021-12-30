import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number 1");
        float x = sc.nextFloat();
        System.out.println("Enter the number 2");
        float y = sc.nextFloat();
        System.out.println("Select operator from +,-,*/ ");
        String op = sc.next();
        if(op=="+"){
            System.out.println(x+y);
        }else if(op=="-"){
            System.out.println(x-y);
        }else if (op=="*"){
            System.out.println(x*y);
        }else{
            System.out.println(x/y);
        }

    }
}
