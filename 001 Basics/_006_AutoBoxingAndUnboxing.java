public class _006_AutoBoxingAndUnboxing {
    public static void main(String[] args) {
        int x = 10;
        // Autoboxing
        Integer y = x;
        // Unboxing
        int z = y;
        x = 20;
        y = 30;
        System.out.println(x + " " + y + " " + z);
    }
}
