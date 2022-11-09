
public class _003_MaxInArray {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 7, 84, 32, 55 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];

        }
        System.out.println(" Max value is : " + max);
    }
}
