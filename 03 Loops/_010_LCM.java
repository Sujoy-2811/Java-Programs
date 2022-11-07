import java.util.Scanner;

public class _010_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, lNum, sNum, GCD, LCM;
        System.out.println("Enter 1st number :");
        a = sc.nextInt();
        System.out.println("Enter 2nd number :");
        b = sc.nextInt();
        if (a == b) {
            GCD = a;

        } else {
            sNum = a > b ? b : a;
            lNum = a > b ? a : b;
            while (sNum != 0) {
                int temp = sNum;
                sNum = lNum % sNum;
                lNum = temp;
            }
            GCD = lNum;
        }
        LCM = (a * b) / GCD;
        System.out.println("LCM of both numbers is " + LCM);
    }
}
