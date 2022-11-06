import java.util.Scanner;

public class _003_SumUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth natural number ");
        int n = sc.nextInt();
        int ans = 0;
        for (int i = n; i > 0; i--) {
            ans += i;
        }
        System.out.println("Sum of nth natural numbers is " + ans);
        sc.close();
    }
}
