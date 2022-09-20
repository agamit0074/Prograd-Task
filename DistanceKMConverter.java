//Program to take input in meter and print the result in KM......
import java.util.Scanner;

public class DistanceKMConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance in Meter :");
        int d = sc.nextInt();
        System.out.println("----------------------------");
        System.out.println("Distance In KM : "+(float)d/1000);
        System.out.println("----------------------------");
        sc.close();
    }
}
