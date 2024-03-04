import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SignIn {
    static final String FILE_NAME = "user_credentials.txt";

    public static void signIn() {
        try {
            Scanner scanner = new Scanner(new File(FILE_NAME));

            Scanner inputScanner = new Scanner(System.in);

            System.out.println("Sign In");
            System.out.print("Enter username: ");
            String username = inputScanner.nextLine(); // Read entire line for username
            System.out.print("Enter password: ");
            String password = inputScanner.nextLine(); // Read entire line for password

            boolean found = false;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Sign-in successful!");
            } else {
                System.out.println("Invalid username or password.");
            }

            scanner.close();
            inputScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error occurred while signing in: " + e.getMessage());
        }
    }
}
