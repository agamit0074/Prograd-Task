//Program to take int array as an input and Print minimun and maximum element in Array
import java.util.Scanner;

public class ArrayProb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Elements :");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter Elements :");
        for (int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int min=ar[0];
        int max=ar[0];
        for (int i=1;i<n;i++){
            if(min>ar[i])
                min=ar[i];
            if (max<ar[i])
                max=ar[i];
        }
        System.out.println("Minimum Element in this Array is : "+min);
        System.out.println("Maximum Element in this Array is : "+max);
        sc.close();
    }
}
