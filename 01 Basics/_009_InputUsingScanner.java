import java.util.Scanner;

public class _009_InputUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  an integer");
        int x = sc.nextInt();
        System.out.println("You entered : " + x);
        sc.close();
    }
}