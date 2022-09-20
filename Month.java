import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter No. of Days : ");
        int n = sc.nextInt();
        System.out.println("===================================");
        System.out.println("Month "+n/30+" Days "+n%30);
        System.out.println("===================================");
    }
}
