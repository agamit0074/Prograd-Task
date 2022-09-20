import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st No. : ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd No. : ");
        int n2 = sc.nextInt();
        System.out.println("===================================");
        System.out.println("BEFORE SWAP : ");
        System.out.println("1st No. "+ n1);
        System.out.println("2nd No. "+ n2);
        System.out.println("===================================");
        System.out.println("AFTER SWAP : ");
        int temp = n1;
        n1= n2;
        n2 = temp;
        System.out.println("1st No. "+ n1);
        System.out.println("2nd No. "+ n2);
        System.out.println("===================================");
        sc.close();
    }
}
