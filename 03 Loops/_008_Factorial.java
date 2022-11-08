import java.util.Scanner;

public class _008_Factorial {
    public static void main(String[] args) {
        int n, i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        sc.close();
        n = num;
        for (; n > 0; n--) {
            i *= n;
        }
        System.out.println("Factorial of " + num + " is " + i);
    }
}
