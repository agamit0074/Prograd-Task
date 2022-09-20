/*Program to Prepare a menu Driven Program for Matrix operation
  Like Addition of two Matrix,Subtaraction of Two Matrix and Transpose of Matrix
  And if user entered Wrong Choice then to again ask for a correct choice*/
import java.util.Scanner;

public class MatrixMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte choice=0;
        do{
            System.out.println("------------------------------");
            System.out.println("ENTER CHOICE WHAT YOU WANT TO PERFORM :");
            System.out.println("1. ADDITION\n2. SUBTRACTION\n3. TRANSPOSE");
            System.out.println("------------------------------");
            choice = sc.nextByte();
            switch (choice){
                    // case 1 for Addition of Two Matrix
                case 1 : System.out.println("Enter the no. of Rows in matrix 1");
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
                    break;
                    //Case 2 for Subtraction of Two Matrix
                case 2:
                    System.out.println("Enter the no. of Rows in matrix 1");
                    int r3 = sc.nextInt();
                    System.out.println("Enter the no. of Column in matrix 1");
                    int c3 = sc.nextInt();
                    System.out.println("Enter the no. of Rows in matrix 2");
                    int r4 = sc.nextInt();
                    System.out.println("Enter the no. of Column in matrix 2");
                    int c4 = sc.nextInt();
                    if(r3==r4&&c3==c4){
                        int[][] m1 = new int[r3][c3];
                        int[][] m2 = new int[r4][c4];
                        System.out.println("Enter Elements in Matrix 1 : ");
                        for(int i = 0; i<r3;i++) {
                            for(int j =0;j<c3;j++){
                                m1[i][j]=sc.nextInt();
                            }
                        }
                        System.out.println("Enter Elements in Matrix 2 : ");
                        for(int i=0; i<r4;i++) {
                            for(int j=0;j<c4;j++) {
                                m2[i][j]=sc.nextInt();
                            }
                        }
                        System.out.println("Elements in Matrix 1 : ");
                        for(int i = 0; i<r3;i++) {
                            for(int j =0;j<c3;j++) {
                                System.out.print(m1[i][j]+" ");
                            }
                            System.out.println();
                        }
                        System.out.println("Elements in Matrix 2 : ");
                        for(int i = 0; i<r4;i++) {
                            for(int j =0;j<c4;j++) {
                                System.out.print(m2[i][j]+" ");
                            }
                            System.out.println();
                        }
                        System.out.println("After Subtraction : ");
                        for(int i = 0; i<r4;i++) {
                            for(int j =0;j<c4;j++) {
                                System.out.print(m1[i][j]-m2[i][j]+" ");
                            }
                            System.out.println();
                        }
                    }
                    else
                        System.out.println("Sorry Matrix Subtraction is not Possible As there Should be Same no. of Rows And Column.");
                    break;
                    //Case 3 for Transpose of a Matrix
                case 3:
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
                    break;
                default:
                    System.out.println("Enter Correct Choice!! \n You Can Try Again.......");
            }

        }while(choice<1||choice>3);
        sc.close();
    }
}
