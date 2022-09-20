import java.util.Scanner;
public class StudentAverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks Of JAVA");
        byte j = sc.nextByte();
        System.out.println("Enter Marks of SQL");
        byte s= sc.nextByte();
        System.out.println("Enter Marks of Spring");
        byte sp = sc.nextByte();
        if(j>100||s>100||sp>100){
            System.out.println("marks Entered by you is more thean 100");
        }
        else{
            float  avg =  (float)(j+s+sp)/3;
            System.out.printf("Average Marks of Student: %.2f", avg);
        }
        sc.close();
    }
}
