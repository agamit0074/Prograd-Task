import java.util.Scanner;

public class SumOfDigitsR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        int sum = sum(n);
        System.out.println("===================================");
        System.out.println("Sum of Digits : "+ sum);
        System.out.println("===================================");
        sc.close();
    }

     static int sum(int n) {
        if(n<10)
            return n;
        return n%10+sum(n/10);
    }
}
