import java.util.Scanner;

public class _005_FunctionReturn {
    public static void main(String[] args) {
        int x, y, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        x = sc.nextInt();
        System.out.println("Enter 2nd number ");
        y = sc.nextInt();
        sc.close();
        total = sum(x, y);
        System.out.println("Sum of both number is " + total);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
