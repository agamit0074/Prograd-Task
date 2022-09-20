import java.util.Scanner;

public class CharacterDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character");
        char c = sc.next().charAt(0);
        System.out.println("----------------------------");
        System.out.println("Result is : "+(((int)c>=48&&(int)c<=57)?"DIGIT":"CHARACTER"));
        System.out.println("----------------------------");
        sc.close();
    }
}
