import java.util.Scanner;

/**
 * LogicalOperator
 */
public class _014_LogicalOperator {

    public static void main(String[] args) {
        String usr = "sujoy", pwd = "123";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username :");
        String username = sc.next();
        System.out.println("Enter password :");
        String password = sc.next();
        if (usr.equals(username) && pwd.equals(password)) {
            System.out.println("Welcome, Sujoy");
        } else {
            System.out.println("try again");
        }
        sc.close();
    }
}