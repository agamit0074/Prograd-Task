//Program to find user entered string is character or digit using conditional operator....
import java.util.Scanner;

public class CharacterDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character");
        char c = sc.next().charAt(0);
        System.out.println("----------------------------");
        System.out.println("Result is : "+(((int)c>=48&&(int)c<=58)?"DIGIT":"CHARACTER"));
        System.out.println("----------------------------");
        sc.close();
    }
}
