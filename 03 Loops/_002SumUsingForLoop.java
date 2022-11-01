import java.util.Scanner;

public class _002SumUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth natural number ");
        int n = sc.nextInt();
        int ans = 0;
        for (; n > 0; n--) {
            ans += n;
        }
        System.out.println("Sum of nth natural numbers is " + ans);
        sc.close();
    }
}
