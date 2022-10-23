import java.util.Scanner;

public class _001_IsnumEven {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Entered number is " + evenCheck(a));

    }

    public static String evenCheck(int n) {
        if (n % 2 == 0) {
            return "even";
        }
        return "not even";
    }
}
