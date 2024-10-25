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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCodePosty() {
        return CodePosty;
    }

    public void setCodePosty(String CodePosty) {
        if (CodePosty.length() == 5) {
            this.CodePosty = CodePosty;
        } else {
            System.out.println("invalid");
            System.exit(0);
        }
    }

    public void printAddress() {
        System.out.println("City: " + city);
        System.out.println("Street: " + street);
        System.out.println("CodePosty: " + CodePosty);
    }
}
