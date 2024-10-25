public class Address {
        private String city;
        private String street;
        private String CodePosty;

    public Address(String city, String street, String CodePosty) {
        if (CodePosty.length() == 5) {
            this.city = city;
        } else {
            System.out.println("invalid");
            System.exit(0);
        }
        this.street = street;
        this.CodePosty = CodePosty;
    }

}
