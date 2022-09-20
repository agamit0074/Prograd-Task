import java.util.Scanner;

public class ArrayProb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Elements :");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter Elements :");
        for (int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.println(ar[i]+"Square of this Element is : "+ar[i]*ar[i]);
            System.out.println(ar[i]+"Cube of this Element is : "+ar[i]*ar[i]*ar[i]);
        }
        sc.close();

    }
}
