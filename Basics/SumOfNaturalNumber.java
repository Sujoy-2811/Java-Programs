import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth natural number ");
        int n = sc.nextInt();
        int ans = (n * (n + 1)) / 2;
        System.out.println("Sum of nth natural numbers is " + ans);
        sc.close();
    }
}
