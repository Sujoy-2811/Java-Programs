import java.util.Scanner;

public class _003_LargestOf3Nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number");
        int c = sc.nextInt();
        sc.close();
        System.out.println("Largest number is : " + getLargestNumber(a, b, c));
    }

    public static int getLargestNumber(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        }
        if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
