import java.util.Scanner;

public class _005_DistinctElements {
    public static void main(String[] args) {
        int n = 0, arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("No of elements :");
        n = sc.nextInt();
        System.out.println("Note: Numbers can be same or distinct.");
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value of " + (i + 1) + " element :");
            arr[i] = sc.nextInt();
        }
        System.out.println("No of distinct elements are " + count(arr));
        sc.close();
    }

    public static int count(int arr[]) {
        int count = 0, size = arr.length;
        Boolean isDistinct = true;
        for (int i = 0; i < size; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                count++;
                isDistinct = true;
            }
        }
        return count;
    }
}