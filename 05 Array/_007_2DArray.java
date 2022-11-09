public class _007_2DArray {
    public static void main(String[] args) {
        int[][] arr = { { 4, 5, 6, 4, 3, 2, }, { 30, 4, 3, 3, 3, 2 } };
        for (int i = 0; i < arr.length; i++) {
            System.out.print("    {");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("\t" + arr[i][j]);
            }
            System.out.println("    }");
        }
    }
}
