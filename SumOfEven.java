import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        int sum =0;
        System.out.println("------------------------");
        for (int i=2;i<=n;i++){
            if(i%2==0)
                sum=sum+i;
        }
        System.out.println("Sum of all Even no. till "+n+" is : "+sum);
        System.out.println("------------------------");
        sc.close();
    }
}
