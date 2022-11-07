public class _003_CallByValue {
    public static void main(String[] args) {
        int x = 8;
        System.out.println("Value of x  before function call : " + x);
        changeValue(x);
        System.out.println("Value of x  after function call : " + x);
    }

    public static void changeValue(int a) {
        a = 10;
    }
}
