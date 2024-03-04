import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SignUp {
    static final String FILE_NAME = "user_credentials.txt";

    public static void signUp() {
        try {
            FileWriter writer = new FileWriter(FILE_NAME, true);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Sign Up");
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            writer.write(username + " " + password + "\n");
            writer.close();
            scanner.close();

            System.out.println("Sign-up successful for username: " + username);
        } catch (IOException e) {
            System.out.println("Error occurred while signing up: " + e.getMessage());
        }
    }
}
