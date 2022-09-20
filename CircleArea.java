//Program to take radius as an input and print area and circumference of a circle......
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of a Circle : ");
        float r = sc.nextFloat();
        System.out.println("===================================");
        System.out.printf("Circumference of a circle is : %.2f", 2*3.14*r);
        System.out.println();
        System.out.printf("Area of a circle is : %.2f",3.14*r*r);
        System.out.println();
        System.out.println("===================================");

    }
}
