public class _012_ArithmeticOperator {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println(x + y);
        System.out.println(x * y);
        System.out.println(y / x);
        System.out.println(y % x);
        System.out.println(x + 10 * y);
        int z = x++;
        System.out.println(z + " " + x);
        z = ++x;
        System.out.println(z + " " + x);
    }
}
