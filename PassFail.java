import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Percentage");
        int p = sc.nextInt();
        System.out.println("----------------------------");
        System.out.println("Result is : "+((p>=40)?"PASS":"FAIL"));
        System.out.println("----------------------------");
        sc.close();
    }
}
