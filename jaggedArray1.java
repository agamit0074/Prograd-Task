import java.util.Scanner;

public class jaggedArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No. of rows in an Array : ");
        int r = sc.nextInt();
        int[][] arr = new int[r][];
        for (int i=0;i<r;i++){
            System.out.println("Enter no. of Elements in Row "+(i+1)+" : ");
            int c = sc.nextInt();
            arr[i] = new int[c];
        }
        System.out.println("Enter The Elements in a Jagged Array");
        for (int i=0;i<r;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Jagged Array : ");
        for (int i=0;i<r;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0;i<r;i++){
            int sum = 0;
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            System.out.println("Sum of "+(i+1)+" is : "+sum);
        }
        sc.close();
    }
}
