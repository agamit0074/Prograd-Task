import java.util.Scanner;

public class NumberRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = sc.nextInt();
        int rev=0;
        do{
            int rem = n%10;
            n=n/10;
            rev=rev+rem;
            if(n>0)
                rev*=10;
        }while (n>0);
        System.out.println("Reverse of Digit is : "+rev);
        sc.close();
    }
}
