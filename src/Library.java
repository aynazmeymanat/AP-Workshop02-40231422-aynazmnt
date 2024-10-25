import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library with a collection of books and members.
 */
public class Library {
    private String name;
    private List<Book> books;
    private List<Member> members;

    /**
     * Constructs a Library with the specified name.
     * Initializes the books and members lists.
     *
     * @param name The name of the library.
     */
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    /**
     * Adds a new book to the library.
     *
     * @param book The book to add.
     */
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " add to library");
    }

    /**
     * Registers a new member in the library.
     *
     * @param member The member to register.
     */
    public void addMember(Member member) {
        members.add(member);
        System.out.println(member.getName() + " Registered in the library");
    }

    /**
     * Allows a member to borrow a book from the library.
     *
     * @param book   The book to borrow.
     * @param member The member borrowing the book.
     */
    public void borrowBook(Book book, Member member) {
        member.borrowBook(book);
        book.updateCount();
    }

    /**
     * Allows a member to return a borrowed book to the library.
     *
     * @param book   The book to return.
     * @param member The member returning the book.
     */
    public void returnBook(Book book, Member member) {
        member.returnBook(book);
    }

    /**
     * Prints the details of the library including available books and members.
     */
    public void printLibraryInfo() {
        System.out.println("library " + name);
        System.out.println("books");
        for (Book book : books) {
            if (book.isAvailable())
                book.printBookInfo();
        }
        System.out.println("member");
        for (Member member : members) {
            member.printMemberInfo();
        }
    }

    /**
     * Finds and returns a list of books by a specific author.
     *
     * @param authorName The name of the author.
     * @return A list of books by the specified author.
     */
    public List<Book> findBooksByAuthor(String authorName) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(authorName)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }
}
