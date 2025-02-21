import java.util.*;

public class Library {
    static Scanner sc = new Scanner(System.in);
    static String[] books;
    static int count = 0;
    static String[] ibooks;
    static int size;
    static int icount = 0;
    static int acount = 0;

    public static void main(String[] args) {
        System.out.println("This is an online Library....");
        sizeOfArray();
    }

    public static void sizeOfArray() {
        System.out.println("Enter the number of Books : ");
        size = sc.nextInt();
        books = new String[size];
        ibooks = new String[size];
        sc.nextLine();
        commands();
    }

    // All the Command check.
    public static void commands() {
        while (true) {
            System.out.println("\nEnter the command [return, list, add, issue, exit]: ");
            String com = sc.nextLine().trim().toLowerCase();
            switch (com) {
                case "exit":
                    System.out.println("You successfully exited the library.....");
                    return;

                case "list":
                    list();
                    break;

                case "issue":
                    issue();
                    break;

                case "add":
                    add();
                    break;

                case "return":
                    retMethod();
                    break;

                default:
                    System.out.println("Invalid method entered......");
                    break;
            }
        }
    }

    // Command Functions.
    public static int add() {
        if (count < size) {
            System.out.println("Enter the name of book to be added : ");
            books[count] = sc.nextLine();

            System.out.println("The book is successfully added......");
            count++;
            acount++;
            return count;
        } else {
            System.out.println("The library is full....");
        }

        commands();
        return count;
    }

    public static void issue() {
        boolean check = false;
        System.out.println("Enter the book to be issued : ");
        String isbook = sc.nextLine().toLowerCase();

        for (int i = 0; i < size; i++) {
            if (books[i] != null && isbook.equals(books[i].toLowerCase())) {
                ibooks[icount] = books[i];
                icount++;
                check = true;
                System.out.println("The book '" + books[i] + "' is successfully issued......");
                break;
            }
        }

        if (!check) {
            System.out.println("The book is not available in the library........");
        }
        commands();
    }

    public static void retMethod() {
        if (icount == 0) {
            System.out.println("There is no book issued in the Library !!");
        } else {
            System.out.println("Enter the name of the book to be returned : ");
            String retbook = sc.nextLine();
            retbook = retbook.trim();
            boolean found = false;

            for (int i = 0; i < size; i++) {
                if (ibooks[i] != null && retbook.equalsIgnoreCase(ibooks[i])) {
                    ibooks[i] = null;
                    System.out.println("The book is successfully returned......");
                    found = true;
                    icount--;
                    break;
                }
            }

            if (!found) {
                System.out.println("There is no such book issued....");
            }
        }
        commands();
    }

    public static void list() {
        System.out.print("List of issued books: ");
        for (String book : ibooks) {
            if (book != null)
                System.out.print(book + ", ");
        }
        System.out.println();
        commands();
    }
}