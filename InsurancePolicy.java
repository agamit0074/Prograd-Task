import java.util.Scanner;

public class InsurancePolicy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marital Status[Married/UnMarried] : ");
        char ms = sc.next().charAt(0);
        System.out.println("----------------------------");
        if(ms=='U'||ms=='u'){
            System.out.println("Enter Gender[Male/Female] :");
            char g = sc.next().charAt(0);
            if(g=='m'||g=='M'){
                System.out.println("Enter Age : ");
                byte age = sc.nextByte();
                if(age>30)
                    System.out.println("Insured");
                else
                    System.out.println("Not Insured");
            }
            else{
                System.out.println("Enter Age : ");
                byte age = sc.nextByte();
                if(age>25)
                    System.out.println("Insured");
                else
                    System.out.println("Not Insured");
            }
        }
        else
            System.out.println("Insured");
        System.out.println("----------------------------");
        sc.close();
    }
}
