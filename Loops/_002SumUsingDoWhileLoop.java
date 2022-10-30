
import java.util.Scanner;

public class _002SumUsingDoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth natural number ");
        int n = sc.nextInt();
        int ans = 0;
        do {
            ans += n;
            n--;
        } while (n > 0);
        System.out.println("Sum of nth natural numbers is " + ans);
        sc.close();
    }
}
