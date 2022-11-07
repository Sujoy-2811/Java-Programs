import java.util.Scanner;

public class _002_ParameterizedFun {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        a = sc.nextInt();
        System.out.println("Enter 2nd number");
        b = sc.nextInt();
        maxNum(a, b);
        sc.close();

    }

    public static void maxNum(int x, int y) {
        if (x == y) {
            System.out.println("Both are equal");
            return;
        }
        int max = x > y ? x : y;
        System.out.println("Greater number is   " + max);
    }
}
