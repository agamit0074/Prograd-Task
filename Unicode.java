import java.util.Scanner;

public class Unicode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character : ");
        char ch = sc.next().charAt(0);
        System.out.println("===================================");
        System.out.println("UNICODE FOR THIS CHARACTER IS : "+(int)ch);
        System.out.println("===================================");
        sc.close();
    }
}
