import java.util.Scanner;

public class _002_SumNNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number ");
        int n = sc.nextInt();
        if (n > 0) {

            int ans = (n * (n + 1)) / 2;
            System.out.println("Sum of first" + n + " natural numbers is " + ans);
        } else {
            System.out.println("It is not a natural number..");
        }
        sc.close();
    }
}
