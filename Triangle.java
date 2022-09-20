import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Angle :");
        byte a1 = sc.nextByte();
        System.out.println("Enter 2nd Angle :");
        byte a2 = sc.nextByte();
        System.out.println("Enter 3rd Angle :");
        byte a3 = sc.nextByte();
        System.out.println("----------------------------");
        if((a1+a2+a3)==180 &&a1>0 && a2>0 && a3>0)
            System.out.println("This is valid Triangle");
        else
            System.out.println("This is Not valid Triangle");
        System.out.println("----------------------------");
        sc.close();
    }
}
