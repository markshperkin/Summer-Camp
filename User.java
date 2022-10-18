public abstract class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNum;
    private String  street;
    private String town;
    private String state;
    private int zipCode;
    private String country;
    private String birthday;

    public User(String firstName, String lastName, String email, String phoneNum, String birthday, String street
    , String town, String state, int zipCode, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNum = phoneNum;
        this.birthday = birthday;
        this.street = street;
        this.town = town;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String ViewActivities() {
        return null;
    }

    public String addAddress(String street, String town, String state, int zipCode, String country) {
        return "";
    }
}
