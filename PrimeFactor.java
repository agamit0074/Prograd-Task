import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        for (int i=2;i<=n/2;i++){
            if(n%i==0){
                boolean bo = isPrime(i);
                if(bo==true)
                    System.out.print(i+" ");
            }
        }

    }

    static boolean isPrime(int n) {
        for (int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
