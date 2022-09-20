import java.util.Scanner;


public class SumUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number up to Which you Want to sum : ");
        int n = sc.nextInt();
        System.out.println("sum 1 to "+n+" is : "+sum(n));
        sc.close();
    }
    static int sum(int n){
        if(n==1)
            return 1;
        return n+sum(n-1);
    }
}
