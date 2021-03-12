package gettestie.src.main.java.rocks.zipcode;

public class HomeAddress {
    private String street;
    private String town;
    private String postCode;
    private String country;

    /**
     * Construct an Address without country
     */
    public HomeAddress(String street, String town, String postCode) {
        this(street, town, postCode, "");
    }

    /**
     * Construct an Address with full details
     */
    public HomeAddress(String street, String town, String postCode, String country) {
        this.street = street;
        this.town = town;
        this.postCode = postCode;
        this.country = country;
    }

    /**
     * Return a string representation of this object.
     */
    public String toString() {
        return street + "\n" + town + " " + postCode + "\n" + country + "\n";
    }
}
