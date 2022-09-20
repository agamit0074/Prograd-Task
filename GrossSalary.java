//Program to take Basic salary as an input and print its Gross Salary if employee is getting BS less than 20,000 then will receive 20% bonus otherwise 10%.... 
import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary : ");
        int sal = sc.nextInt();
        System.out.println("----------------------------");
        if(sal>=20000){
            System.out.println("You will Get 10% Bonus");
            System.out.printf("Gross Salary : %.2f\n",(float)(sal+(0.1*sal)+(0.15*sal)+(0.2*sal)+(0.1*sal)-(0.12*sal)));
        }
        else {
            System.out.println("You will Get 20% Bonus");
            System.out.printf("Gross Salary : %.2f\n", (float) (sal + (0.1 * sal) + (0.15 * sal) + (0.2 * sal) + (0.2 * sal) - (0.12 * sal)));
        }
        System.out.println("----------------------------");
        sc.close();
    }
}
