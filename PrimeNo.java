import java.util.Scanner;

public class PrimeNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        boolean bo = isPrime(n);
        if(bo==true)
            System.out.println("This Number is Prime Number");
        else
            System.out.println("This Number is not a Prime Number");
        sc.close();
    }

    static boolean isPrime(int n) {
        for (int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
