public class NonPrimitiveType {

    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.a = 10;
        Test obj2 = obj1;
        obj2.a = 50;

        System.out.println("Value of a of obj1 : " + obj1.a);
        System.out.println("Value of a of obj2 : " + obj2.a);
    }

}

class Test {
    int a;
}