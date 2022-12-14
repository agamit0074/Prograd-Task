/*Program to make a Menu to perform
   1. to check no. is odd or even
   2. to check no. is Positive or Negetive
   3. to check which no. is greater between two no.s
   4. take no. of days as an input and print no. of months and Remainig Days*/
import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte choice;
        do{
        System.out.println("---------------------------------");
        System.out.println("Enter Correct Choice  :");
        System.out.println("1. ODD/EVEN\n2. POSITIVE/NEGATIVE\n3. MAXIMUM\n4. DAYS INTO MONTH AND REMAINING DAYS ");
        System.out.println("---------------------------------");
        choice = sc.nextByte();
            switch (choice) {
                    //to check no. is even or odd
                case 1:
                    System.out.println("Enter Number :");
                    int n = sc.nextInt();
                    System.out.println("---------------------------------");
                    System.out.println("Number " + n + " is " + ((n % 2 == 0) ? "Even" : "Odd"));
                    System.out.println("---------------------------------");
                    break;
                    //to check no. is positive or negetive
                case 2:
                    System.out.println("Enter Number : ");
                    int n2 = sc.nextInt();
                    System.out.println("---------------------------------");
                    System.out.println("Number " + n2 + " is " + ((n2 >= 0) ? "POSITIVE" : "NEGATIVE"));
                    System.out.println("---------------------------------");
                    break;
                    //to check which no. is greater 
                case 3:
                    System.out.println("Enter 1st Number : ");
                    int a = sc.nextInt();
                    System.out.println("Enter 2nd Number : ");
                    int b = sc.nextInt();
                    System.out.println("---------------------------------");
                    System.out.println("Maximum : " + ((a > b) ? a : b));
                    System.out.println("---------------------------------");
                    break;
                    // to cover days into month
                case 4:
                    System.out.println("Enter no. of Days : ");
                    int d = sc.nextInt();
                    System.out.println("---------------------------------");
                    System.out.println("Month " + d / 30 + " Days " + d % 30);
                    System.out.println("---------------------------------");
                    break;
                default:
                    System.out.println("Wrong Input Please Try again....");
            }
        }while (choice<1||choice>4);
    }
}
