
import java.util.Scanner;

public class _001_SumUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth natural number ");
        int n = sc.nextInt();
        int ans = 0;
        while (n > 0) {
            ans += n;
            n--;
        }
        System.out.println("Sum of nth natural numbers is " + ans);
        sc.close();
    }
}
