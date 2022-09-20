import java.util.Scanner;

public class PowerRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base :");
        int n = sc.nextInt();
        System.out.println("Enter Exponent");
        int p = sc.nextInt();
        System.out.println(n+" Exponent of "+p+" is = "+power(n,p));
        sc.close();

    }
    static int power(int n, int p){
        if(p==1)
            return n;
        return n*power(n,p-1);
    }
}
