import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st No.");
        int a1 = sc.nextInt();
        System.out.println("Enter 2st No.");
        int a2 = sc.nextInt();
        System.out.println("----------------------------");
        System.out.println("Minimum no. between "+a1+" and "+a2+" is : "+((a1<a2)?a1:a2));
        System.out.println("----------------------------");
        sc.close();
    }
}
