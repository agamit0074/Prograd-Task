import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Per Item Price :");
        int ip = sc.nextInt();
        System.out.println("Enter Item Quantity : ");
        int q = sc.nextInt();
        System.out.println("----------------------------");
        if(q>=10){
            System.out.println("Great You are Eligible for 10% Discount");
            System.out.printf("Total amount to pay : %.2f\n",(q*ip)-(0.1*(q*ip)));
            System.out.println("Thanks! For Buying");
        }
        else{
            System.out.printf("Total amount to pay : %.2f\n",(float)(q*ip));
            System.out.println("Thanks! For Buying");
        }
        System.out.println("----------------------------");
        sc.close();
    }
}
