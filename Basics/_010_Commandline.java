public class _010_Commandline {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Aruguments are : ");
            for (String x : args) {
                System.out.println(x);
            }
        } else {
            System.out.println("No arguments");
        }
    }
}
