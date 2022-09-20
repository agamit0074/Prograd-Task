import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount : ");
        int p = sc.nextInt();
        System.out.println("Enter Period of Loan : ");
        int t = sc.nextInt();
        System.out.println("----------------------------------------------");
        System.out.printf("Interest for the Loan you have to pay : %.2f\n",((p*7.5*t)/100.0));
        System.out.printf("Total amount to pay to the Bank       : %.2f\n",(p+((p*7.5*t)/100.0)));
        System.out.println("----------------------------------------------");
        sc.close();
    }

}
