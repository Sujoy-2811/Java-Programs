
public class _002_SumOfArray {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 7, 84, 32, 55 };
        System.out.println("Sum of an Array : " + sum(arr));
    }

    public static int sum(int[] x) {
        int ans = 0;
        for (int i = 0; i < x.length; i++) {
            ans += x[i];
        }
        return ans;
    }
}
