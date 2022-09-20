import java.util.Scanner;

public class ThirdAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Angle of Triangle : ");
        byte a1 = sc.nextByte();
        System.out.println("Enter 2nd Angle of Triangle : ");
        byte a2 = sc.nextByte();
        System.out.println("----------------------------");
        System.out.println("Third angle of Triangle : "+(180-a1-a2));
        System.out.println("----------------------------");
        sc.close();
    }
}
