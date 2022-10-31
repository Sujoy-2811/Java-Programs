import java.util.Scanner;

public class _019_LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number ");
        int n = sc.nextInt();
        int ans = Math.abs(n) % 10;
        System.out.println("Last digit of entered number is " + ans);
        sc.close();
    }
}
