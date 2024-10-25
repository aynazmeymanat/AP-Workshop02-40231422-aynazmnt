import java.util.List;

public class Mainn {
        public static void main(String[] args) {

            Library library = new Library("lib1");

            Book book4 = new Book("98765", "library", "x1" , Genre.FICTION);
            Book book1 = new Book("58736", "math", "x1" , Genre.NON_FICTION);
            Book book2 = new Book("82649", "phisices", "x3" , Genre.HISTORY);
            Book book3 = new Book("95317", "history", "x4" , Genre.SCIENCE);
            Book book5 = new Book("64025", "math", "x5" , Genre.FANTASY);

            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);
            library.addBook(book4);
            library.addBook(book5);

            Address address1 = new Address("Tehran", "Valiasr St", "00000");
            Address address2 = new Address("Tehran", "Enghlab St", "11111");

            Member member1 = new Member("087463", "Aynaz" , address1);
            Member member2 = new Member("864200", "Dora" , address2);


            library.addMember(member1);
            library.addMember(member2);

            library.borrowBook(book1 , member2);
            library.borrowBook(book2 , member2);
            library.borrowBook(book3 , member2);

            library.borrowBook(book5 , member1);
            library.borrowBook(book4 , member1);
            library.borrowBook(book3 , member1);


            library.returnBook(book5,member1);
            library.returnBook(book2,member2);



            library.printLibraryInfo();

            member1.updateAddress(address2);
            member2.updateAddress(address1);

            member1.printMemberInfo();

            List<Book> x1Books = library.findBooksByAuthor("x1");
            System.out.println("x1 books");
            for (Book book : x1Books) {
                book.printBookInfo();
            }




        }

    }

