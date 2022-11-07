public class _004_CallByReference {
    public static void main(String[] args) {
        Vector vec = new Vector();
        System.out.println("Value of x and y before function call : " + vec.x + "  " + vec.y);
        changeValue(vec);
        System.out.println("Value of x and y after function call : " + vec.x + "  " + vec.y);
    }

    public static void changeValue(Vector a) {
        a.x = 10;
        a.y = 10;
    }
}

class Vector {
    int x = 13;
    int y = 45;
}