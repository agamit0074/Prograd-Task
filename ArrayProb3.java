import java.util.Arrays;
import java.util.Scanner;

public class ArrayProb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Elements :");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter Elements :");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        int max = ar[n-1];
        for (int i = n-2; i>0; i--) {
            if(ar[i]<max){
                max=ar[i];
                break;
            }
        }
        if(max==ar[n-1])
            System.out.println("All Elements Are Same");
        else
            System.out.println("Second Largest Element : "+max);
        sc.close();
    }
}
