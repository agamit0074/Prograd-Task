import java.util.Scanner;

public class MatrixProb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Rows in matrix : ");
        int r = sc.nextInt();
        System.out.println("Enter the no. of Column in matrix : ");
        int c = sc.nextInt();
        int[][] m = new int[r][c];
        System.out.println("Enter Elements in Matrix : ");
        for(int i = 0; i<r;i++) {
            for(int j =0;j<c;j++){
                m[i][j]=sc.nextInt();
            }
        }
        int[][] tm = new int[c][r];
        System.out.println("Before Transpose : ");
        for(int i=0; i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After Transpose : ");
        for(int i = 0; i<c;i++) {
            for(int j =0;j<r;j++) {
                System.out.print(m[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
