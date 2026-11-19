
import java.util.Scanner;

public class Library {

    static void addBook(String name, String author, int id) {
        System.out.println("\nBook Added Successfully!");
        System.out.println("Book ID: " + id);
        System.out.println("Book Name: " + name);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Library Management System");

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        addBook(name, author, id);

        sc.close();
    }
}
