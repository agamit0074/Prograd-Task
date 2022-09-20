//Program to find Factorial Of a Number.....
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        System.out.println("------------------------");
        System.out.println("Factorial of a given Number is : "+isFactorial(n));
        System.out.println("------------------------");
        sc.close();
    }

     static int isFactorial(int n) {
        int f =1;
        for(int i=2;i<=n;i++)
            f= f*i;
        return f;
    }
}
