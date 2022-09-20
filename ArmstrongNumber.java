import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Digit Number : ");
        short n = sc.nextShort();
        int sum = 0,am=n;
        do{
            int r = (n%10);
            n/=10;
            sum=sum+(r*r*r);
        }while (n>0);
        if (sum==am)
            System.out.println("This Number is an Armstrong Number");
        else
            System.out.println("This Number is Not an Armstrong Number");
        sc.close();
    }
}
