import java.util.Scanner;

import javax.net.ssl.SNIMatcher;

public class _009_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, lNum, sNum;
        System.out.println("Enter 1st number :");
        a = sc.nextInt();
        System.out.println("Enter 2nd number :");
        b = sc.nextInt();
        if (a == b) {
            System.out.println("GCD of both number is " + a);
            return;
        }
        sNum = a > b ? b : a;
        lNum = a > b ? a : b;
        while (sNum != 0) {
            int temp = sNum;
            sNum = lNum % sNum;
            lNum = temp;
        }
        System.out.println("GCD of both number is " + lNum);
    }
}
