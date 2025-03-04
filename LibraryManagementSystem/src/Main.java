
import com.library.database.*;
import com.library.models.User;
import com.library.ui.*;
import com.library.services.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        BookDAO bookDAO = new BookDAO();
        AuthService authService = new AuthService(userDAO);
        BookService bookService = new BookService(bookDAO);
        Dashboard dashboard = new Dashboard(bookService);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Library Management System");
        while (true) {
            System.out.println("\n1) Login\n2) Register\n3) Exit");
            System.out.println("Please enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 3) break;
            System.out.println("Enter username : ");
            String username = scanner.nextLine();
            System.out.println("Enter password : ");
            String password = scanner.nextLine();

            if(choice == 1) {
                User user = authService.login(username,password);
                if(user != null) {
                    System.out.println("Logged in");
                    dashboard.showMenu(user);
                }else{
                    System.out.println("Invalid username or password");
                }
            }else if(choice == 2) {
                System.out.println("Enter Role : \n1) Librarian\n2) Member \n");
                int role = scanner.nextInt();
                String StringRole = "";
                if(role == 1) {
                    StringRole = "Librarian";
                }else if(role == 2) {
                    StringRole = "Member";
                }
                if(authService.register(username,password,StringRole)){
                    System.out.println("Registered");
                }else{
                    System.out.println("User already exists");
                }
            }
        }
        scanner.close();
    }
}