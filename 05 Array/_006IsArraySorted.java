import java.util.Scanner;

public class _006IsArraySorted {
    public static void main(String[] args) {
        int n = 0, arr[];
        String msg;
        Scanner sc = new Scanner(System.in);
        System.out.println("No of elements :");
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value of " + (i + 1) + " element :");
            arr[i] = sc.nextInt();
        }
        msg = isSorted(arr) ? " sorted" : " not sorted";
        System.out.println("Array is" + msg);
        sc.close();
    }

    public static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;

        }
        return true;
    }
}
