import java.util.Scanner;

public class GP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st term");
        int a = sc.nextInt();
        System.out.println("Enter comman ratio");
        int r = sc.nextInt();
        System.out.println("Enter  nth Term");
        int n = sc.nextInt();
        System.out.println("Value of nth term is " + nthTerm(a, r, n));
        sc.close();
    }

    public static int nthTerm(int a, int r, int n) {

        int ans = 0;
        ans = a * (int) Math.pow(r, n - 1);
        return ans;

    }

}
