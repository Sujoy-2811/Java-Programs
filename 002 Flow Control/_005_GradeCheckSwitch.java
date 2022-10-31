import java.lang.management.GarbageCollectorMXBean;
import java.util.Scanner;

public class _005_GradeCheckSwitch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade (A-F) :");
        char grade = sc.next().charAt(0);
        sc.close();
        grade = Character.toUpperCase(grade);
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }
}