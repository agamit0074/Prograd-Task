import java.util.Scanner;

public class NumberSquareCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        System.out.println("----------------------------");
        System.out.println("Square of a "+n+" is : "+n*n);
        System.out.println("Cube of a "+n+" is : "+n*n*n);
        System.out.println("----------------------------");
        sc.close();
    }
}
