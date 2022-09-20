import java.util.Scanner;

public class PatternProb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows :");
        int n=  sc.nextInt();
        int num =1;
        for (int i =n ;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
