import java.util.Scanner;

public class _005_Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("4 and 5 will break the table");
        System.out.println("Enter number for table of :");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + i * num);
            if (i * num == 4 || i * num == 5)
                break;
        }
        sc.close();
    }
}
