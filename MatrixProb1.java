//Program to Take 2 matrix as an input and Perform Matrix Addition......
import java.util.Scanner;

public class MatrixProb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Rows in matrix 1");
        int r1 = sc.nextInt();
        System.out.println("Enter the no. of Column in matrix 1");
        int c1 = sc.nextInt();
        System.out.println("Enter the no. of Rows in matrix 2");
        int r2 = sc.nextInt();
        System.out.println("Enter the no. of Column in matrix 2");
        int c2 = sc.nextInt();
        if(r1==r2&&c1==c2){
            int[][] m1 = new int[r1][c1];
            int[][] m2 = new int[r2][c2];
            System.out.println("Enter Elements in Matrix 1 : ");
            for(int i = 0; i<r1;i++) {
                for(int j =0;j<c1;j++){
                    m1[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter Elements in Matrix 2 : ");
            for(int i=0; i<r1;i++) {
                for(int j=0;j<c1;j++) {
                    m2[i][j]=sc.nextInt();
                }
            }
            System.out.println("Elements in Matrix 1 : ");
            for(int i = 0; i<r1;i++) {
                for(int j =0;j<c1;j++) {
                    System.out.print(m1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Elements in Matrix 2 : ");
            for(int i = 0; i<r1;i++) {
                for(int j =0;j<c1;j++) {
                    System.out.print(m2[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("After Addition : ");
            for(int i = 0; i<r1;i++) {
                for(int j =0;j<c1;j++) {
                    System.out.print(m1[i][j]+m2[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("Sorry Matrix Addition is not Possible As there Should be Same no. of Rows And Column.");
        sc.close();
    }
}
