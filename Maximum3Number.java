//Program to find Which no. is greater between 3  Numbers useing Conditional Statement.......
import java.util.Scanner;

public class Maximum3Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st No.");
        int a1 = sc.nextInt();
        System.out.println("Enter 2st No.");
        int a2 = sc.nextInt();
        System.out.println("Enter 3st No.");
        int a3 = sc.nextInt();
        System.out.println("----------------------------");
        System.out.println("Maximum no. between "+a1+" and "+a2+" and "+a3+" is : "+((a1>a2)?((a1>a3)?a1:a3):((a2>a3)?a2:a3)));
        System.out.println("----------------------------");
        sc.close();
    }
}
