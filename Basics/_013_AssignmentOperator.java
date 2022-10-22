public class _013_AssignmentOperator {
    public static void main(String[] args) {
        int x = 10, y = 5, z;
        x += y; // x =x+y
        System.out.println(x);
        x %= y; // x=x%y
        System.out.println(x);
        z = x = y;
        System.out.println(z);
    }
}
