import java.util.Scanner;

public class TableRecursion {
    static int i=1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for Which You Want to Print Table : ");
        int n = sc.nextInt();
        table(n);
        sc.close();
    }

    static int table(int n) {
        if(i==10) {
            System.out.println(n + " * " + i + " = " + n * i);
            return 0;
        }
        System.out.println(n + " * " + i + " = " + n * i);
        i++;
        return table(n);
    }

}
