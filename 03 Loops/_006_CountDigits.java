import java.util.Scanner;

public class _006_CountDigits {
    public static void main(String[] args) {
        int num, count = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        num = sc.nextInt();
        temp = num;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        System.out.println(num + " has " + count + " digits.");
        sc.close();
    }
}
