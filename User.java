public abstract class User {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;
    protected String phoneNum;
    protected String  street;
    protected String town;
    protected String state;
    protected int zipCode;
    protected String country;
    protected String birthday;
    protected String gender;
    protected String user;

    public User(String firstName, String lastName, String email, String password, String phoneNum, String birthday, String street
    , String town, String state, int zipCode, String country, String gender, String user) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNum = phoneNum;
        this.birthday = birthday;
        this.street = street;
        this.town = town;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.gender = gender;
        this.user = user;
    }

    public String ViewActivities() {
        return null;
    }

    public String addAddress(String street, String town, String state, int zipCode, String country) {
        return "";
    }
}
