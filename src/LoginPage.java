import java.util.Scanner;
public class LoginPage {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Enter Username");
        String userName = reader.nextLine();
        System.out.println("Your username has been accepted.");
    }
}
