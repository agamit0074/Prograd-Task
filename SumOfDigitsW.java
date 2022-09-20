import java.util.Scanner;

public class SumOfDigitsW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        System.out.println("===================================");
        System.out.println("Sum of Digits : " + ((n%10)+ ((n/10)%10) + (n/100)));
        System.out.println("===================================");
        sc.close();
    }
}
