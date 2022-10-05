public class PrimitiveType {
    public static void main(String[] args) {
        int val = 50;
        valueChange(val);

        System.out.println(val);
    }

    static void valueChange(int x) {
        x = 10;
    }

}
