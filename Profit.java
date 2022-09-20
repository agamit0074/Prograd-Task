import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Selling Price of an Article :");
        int sp = sc.nextInt();
        System.out.println("Enter Cost Price of an Article :");
        int cp = sc.nextInt();
        System.out.println("----------------------------");
        System.out.printf("Profit Gain : %.2f\n",(float)(sp-cp)/cp*100.0);
        System.out.println("----------------------------");
        sc.close();
    }
}
