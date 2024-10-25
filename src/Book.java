/**
 * Represents a book with details such as ID, title, author, availability, genre, and borrow count.
 */
public class Book {
    private String id;
    private String title;
    private String author;
    private boolean isAvailable;
    private Genre genre;
    private int borrowCount;

    /**
     * Constructs a Book with the specified ID, title, author, and genre.
     * Sets isAvailable to true and borrowCount to 0 by default.
     *
     * @param id     The ID of the book, must be exactly 5 characters long.
     * @param title  The title of the book.
     * @param author The author of the book.
     * @param genre  The genre of the book.
     * @throws IllegalArgumentException if the ID is not exactly 5 characters long.
     */
    public Book(String id, String title, String author, Genre genre) {
        if (id.length() == 5) {
            this.id = id;
        } else {
            System.out.println("invalid");
            System.exit(0);
        }
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.borrowCount = 0;
    }

    /**
     * Gets the ID of the book.
     *
     * @return The ID of the book.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID of the book.
     *
     * @param id The ID to set, must be exactly 5 characters long.
     */
    public void setId(String id) {
        if (id.length() != 5) {
            System.out.println("");
        }
        this.id = id;
    }

    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     *
     * @param title The title to set.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     *
     * @param author The author to set.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Checks if the book is available.
     *
     * @return true if the book is available, false otherwise.
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Sets the availability of the book.
     *
     * @param available true to set the book as available, false otherwise.
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    /**
     * Gets the borrow count of the book.
     *
     * @return The borrow count of the book.
     */
    public int getBorrowCount() {
        return borrowCount;
    }

    /**
     * Sets the borrow count of the book.
     *
     * @param borrowCount The borrow count to set.
     */
    public void setBorrowCount(int borrowCount) {
        this.borrowCount = borrowCount;
    }

    /**
     * Increments the borrow count of the book by 1.
     */
    public void updateCount() {
        this.borrowCount++;
    }

    /**
     * Capitalizes the first letter of each word in the title of the book.
     */
    public void capitalizeTitle() {
        String[] words = title.split(" ");
        StringBuilder capitalizedTitle = new StringBuilder();
        for (String word : words) {
            capitalizedTitle.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        this.title = capitalizedTitle.toString().trim();
    }

    /**
     * Prints the details of the book including ID, title, author, availability, genre, and borrow count.
     */
    public void printBookInfo() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
        System.out.println("Genre: " + genre);
        System.out.println("Borrow Count: " + borrowCount);
    }
}
