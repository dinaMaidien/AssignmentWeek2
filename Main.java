public class Main {
    public static void main(String[] args) {
        // Create Library instance
        Library library = new Library();

        // Add some books to the library
        Book book1 = new Book("Harry Potter", "Fathin", "12345", true);
        Book book2 = new Book("Sang Kancil", "Dina", "67890", true);
        Book book3 = new Book("Itik Bulat", "Ain", "11223", false);
        Book book4 = new Book("AYam bertelur atau beranak", "Diyana", "33445", true);
        
        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);
        library.addBooks(book4);

        // Add some users to the library
        User user1 = new User("Dina", 25);
        User user2 = new User("Dian", 19);

        /*User user1 = new user();
        user1.setName("Alice");
        user1.setAge(25);
        
        User user2 = new User();
        user2.setName("Bob");
        user2.setAge(30);/**/
        
        library.addUser(user1);
        library.addUser(user2);

        // List available books before borrowing
        System.out.println("--- Available Books Before Borrowing ---");
        library.listAvailableBooks();

        // Borrow books
        System.out.println("\n--- Borrowing Books ---");
        library.borrowedBooks(user1, "Harry Potter");
        library.borrowedBooks(user2, "Sang Kancil");

        // List available books after borrowing
        System.out.println("\n--- Available Books After Borrowing ---");
        library.listAvailableBooks();

        // Check borrowed books for each user
        System.out.println("--- Borrowed Books ---");
        user1.printBorrowedBooks();
        user2.printBorrowedBooks();

        // Check due dates for Alice
        System.out.println("--- Sang Kancil's Due Dates ---");
        user1.checkDueDates();

        // Simulate overdue books and check overdue status (if needed)
        System.out.println("--- Overdue Books Check (if implemented) ---");
        user1.overDueBooks();
    }
}
