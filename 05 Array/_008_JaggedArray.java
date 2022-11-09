import java.util.Scanner;

public class _008_JaggedArray {
    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of arrays");
        m = sc.nextInt();
        int[][] arr = new int[m][];
        for (int i = 0; i < m; i++) {
            System.out.println("Enter nos of elements in " + (i + 1) + " array :");
            int n = sc.nextInt();
            arr[i] = new int[n];
            System.out.println("Enter values in " + (i + 1) + " array ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Value of " + (j + 1) + " element :");
                arr[i][j] = sc.nextInt();
            }
        }
        display(arr);
        sc.close();
    }

    public static void display(int x[][]) {
        System.out.println("\n....Given Array.... \n");
        for (int i = 0; i < x.length; i++) {
            System.out.print("    {");
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("\t" + x[i][j]);
            }
            System.out.println("    }");
        }
    }
}