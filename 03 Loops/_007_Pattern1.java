import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class _007_Pattern1 {
    public static void main(String[] args) {
        int num, i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        while (i <= num) {
            int j = 1;
            while (j <= (num - i)) {
                System.out.print(" ");
                j++;

            }
            int k = 1;
            while (k <= (2 * i - 1)) {
                System.out.print("*");
                k++;

            }
            i++;
            System.out.println();
        }
    }
}
