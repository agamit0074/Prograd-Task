//Program to Print fibonacci series upto n terms......
import java.util.Scanner;

public class FibSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Upto which you want to print the Series : ");
        int n = sc.nextInt();
        int a = 0,b=1;
        System.out.println("------------------------");
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int temp = a;
            a=b;
            b+=temp;
        }
        System.out.println();
        System.out.println("------------------------");
    }
}
