import java.util.Scanner;

public class _004_Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Counting upto : ");
        int num = sc.nextInt();
        System.out.println("Skipping multiples of 2 and 3 :");
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 && i % 3 == 0)
                continue;
            System.out.print(i + "\t");
        }
        sc.close();
    }
}
