import java.util.ArrayList;
import java.util.List;

public class Member {
        private String memberId;
        private String name;
        private List<Book> borrowedBooks;
        private Address address;

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
}
