/*program for understanding method Overloading in this program we overload area method
  to calculate area of circle,square,rectangle,triangle */
import java.util.Scanner;

public class AreaOvearload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte choice;
        do{
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Enter Choice : ");
        System.out.println("1. AREA OF CIRCLE\n2. AREA OF SQUARE\n3. AREA OF RECTANGLE\n4. AREA OF TRIANGLE");
        System.out.println("5. Exit");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        choice = sc.nextByte();
        switch (choice){
            case 1:{
                System.out.println("Enter Radius of a Circle : ");
                float r = sc.nextFloat();
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Area of circle : "+area(r));
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            }
            case 2:{
                System.out.println("Enter Sides of a Square : ");
                int sides = sc.nextInt();
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Area of Square : "+area(sides));
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            }
            case 3:{
                System.out.println("Enter length of a Rectangle : ");
                int l = sc.nextInt();
                System.out.println("Enter Height of a Rectangle : ");
                int h = sc.nextInt();
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Area of Rectangle : "+area(l,h));
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            }
            case 4:{
                System.out.println("Enter Base of a Triangle : ");
                float b = sc.nextFloat();
                System.out.println("Enter Height of a Triangle : ");
                float h = sc.nextFloat();
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Area of Triangle : "+area(b,h));
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            }
            case 5:
                System.out.println("Have a nice day!!!");
            default:
                System.out.println("You Had Entered Wrong Input Please Try Again!!");
        }
        }while(choice==5);
        sc.close();
    }
    public static float area(float radius){
        return  3.14f*radius*radius;
    }
    public static int area(int sides){
        return  sides*sides;
    }
    public static int area(int length, int height){
        return length*height;
    }
    public static float area(float length, float base){
        return 0.5f*length*base;
    }
}
