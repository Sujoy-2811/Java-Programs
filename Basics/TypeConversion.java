public class TypeConversion {
    public static void main(String[] args) {

        // Type conversion implicit
        int x = 100;
        long y = x;
        float z = y;

        // Type conversion explicit
        double d = 65.4;
        int i = (int) d;
        char c = (char) i;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(d);
        System.out.println(i);
        System.out.println(c);

    }
}
