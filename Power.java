import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X as a base :");
        int x =sc.nextInt();
        System.out.println("Enter Y as a Power : ");
        int y = sc.nextInt();
        System.out.println("------------------------");
        System.out.println(x+" to the power of "+y+" is : "+isPower(x,y));
        System.out.println("------------------------");
        sc.close();
    }

    static int isPower(int x, int y) {
        int pow = 1;
        for(int i=1;i<=y;i++){
            pow=pow*x;
        }
        return pow;
    }
}
