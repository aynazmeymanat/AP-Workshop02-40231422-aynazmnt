/**
 * Represents an address with details such as city, street, and postal code.
 */
public class Address {
    private String city;
    private String street;
    private String CodePosty;

    /**
     * Constructs an Address with the specified city, street, and postal code.
     *
     * @param city      The city of the address.
     * @param street    The street of the address.
     * @param CodePosty The postal code of the address, must be exactly 5 characters long.
     * @throws IllegalArgumentException if the postal code is not exactly 5 characters long.
     */
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

    /**
     * Gets the city of the address.
     *
     * @return The city of the address.
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city of the address.
     *
     * @param city The city to set.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the street of the address.
     *
     * @return The street of the address.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street of the address.
     *
     * @param street The street to set.
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets the postal code of the address.
     *
     * @return The postal code of the address.
     */
    public String getCodePosty() {
        return CodePosty;
    }

    /**
     * Sets the postal code of the address.
     *
     * @param CodePosty The postal code to set, must be exactly 5 characters long.
     * @throws IllegalArgumentException if the postal code is not exactly 5 characters long.
     */
    public void setCodePosty(String CodePosty) {
        if (CodePosty.length() == 5) {
            this.CodePosty = CodePosty;
        } else {
            System.out.println("invalid");
            System.exit(0);
        }
    }

    /**
     * Prints the details of the address including city, street, and postal code.
     */
    public void printAddress() {
        System.out.println("City: " + city);
        System.out.println("Street: " + street);
        System.out.println("CodePosty: " + CodePosty);
    }
}
