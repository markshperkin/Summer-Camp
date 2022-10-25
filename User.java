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

    public User(String firstName, String lastName, String email, String password, String phoneNum, String birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNum = phoneNum;
        this.birthday = birthday;
    }

    public String ViewActivities() {
        return null;
    }

    public String addAddress(String street, String town, String state, int zipCode, String country) {
        return "";
    }
}
