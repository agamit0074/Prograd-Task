import java.util.Scanner;

public class SomOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        int sum= 0;
        do{
            int r = n%10;
            n=n/10;
            sum = sum+r;
        }while(n>0);
        System.out.println("===================================");
        System.out.println("Sum of Digits : "+ sum);
        System.out.println("===================================");
        sc.close();
    }
}
