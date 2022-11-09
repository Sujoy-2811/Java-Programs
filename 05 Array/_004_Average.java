import java.util.Scanner;

public class _004_Average {
    public static void main(String[] args) {
        int n = 0, arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("No of elements :");
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value of " + (i + 1) + " element :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Average of given numbers  is " + average(arr));
        sc.close();
    }

    public static double average(int x[]) {
        double avg = 0, sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        avg = sum / x.length;
        return avg;
    }
}
