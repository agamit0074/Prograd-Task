import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st No. :");
        int a = sc.nextInt();
        System.out.println("Enter 2nd No. :");
        int b = sc.nextInt();
        System.out.println("----------------------------");
        System.out.println("Addition : "+(a+b));
        System.out.println("Subtract : "+(a-b));
        System.out.println("Multiply : "+a*b);
        System.out.printf("Division : %.2f\n",(float)a/b);
        System.out.println("----------------------------");
        sc.close();
    }
}

