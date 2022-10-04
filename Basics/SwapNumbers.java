/**
 * SwapNumbers
 */
public class SwapNumbers {

    public static void main(String[] args) {
        int a = 10, b = 20, temp;
        System.out.println("Before swap :");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap :");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);

    }
}