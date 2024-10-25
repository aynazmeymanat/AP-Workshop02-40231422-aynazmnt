import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library member with details such as member ID, name, borrowed books, and address.
 */
public class Member {
    private String memberId;
    private String name;
    private List<Book> borrowedBooks;
    private Address address;

    /**
     * Constructs a Member with the specified member ID, name, and address.
     *
     * @param memberId The member ID, must be exactly 6 characters long.
     * @param name     The name of the member.
     * @param address  The address of the member.
     * @throws IllegalArgumentException if the member ID is not exactly 6 characters long.
     */
    public Member(String memberId, String name, Address address) {
        if (memberId.length() == 6) {
            this.memberId = memberId;
        } else {
            System.out.println("Member ID Must be exactly 6 characters");
            System.exit(0);
        }
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
        this.address = address;
    }

    /**
     * Gets the name of the member.
     *
     * @return The name of the member.
     */
    public String getName() {
        return name;
    }

    /**
     * Allows the member to borrow a book if they have borrowed less than 3 books
     * and the book is available.
     *
     * @param book The book to borrow.
     */
    public void borrowBook(Book book) {
        if (borrowedBooks.size() >= 3) {
            System.out.println("A maximum of 3 books can be borrowed");
            return;
        }
        if (!book.isAvailable()) {
            System.out.println(book.getTitle() + " not available");
            return;
        }
        borrowedBooks.add(book);
        book.setAvailable(false);
        System.out.println(book.getTitle() + "It was loaned");
    }

    /**
     * Allows the member to return a borrowed book.
     *
     * @param book The book to return.
     */
    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.setAvailable(true);
            System.out.println(book.getTitle() + "withdrawn");
        } else {
            System.out.println(book.getTitle() + "Not found in the list");
        }
    }

    /**
     * Updates the address of the member.
     *
     * @param newAddress The new address to set.
     */
    public void updateAddress(Address newAddress) {
        this.address = newAddress;
        System.out.println("address updated");
    }

    /**
     * Prints the details of the member including member ID, name, and borrowed books.
     */
    public void printMemberInfo() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.print("Borrowed Books: ");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No book has been borrowed");
        } else {
            for (Book book : borrowedBooks) {
                System.out.print(book.getTitle() + " ");
            }
            System.out.println();
        }
    }
}
