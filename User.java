public abstract class User {
    protected String firstName;
    protected String lastName;
    protected static String email;
    protected static String password;
    protected String phoneNum;
    protected String  street;
    protected String town;
    protected String state;
    protected int zipCode;
    protected String country;
    protected String birthday;

    public User(String firstName, String lastName, String email, String password, String phoneNum, String birthday, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNum = phoneNum;
        this.birthday = birthday;
    }

    // public static void createUser(String firstName,String lastName,String email,String password, String phoneNum, String birthday) {
    //     User user = new User(firstName, lastName, email, password, phoneNum, birthday);
    // }

    public static String getEmail() {
        return email;
    }

    public static String getPassword() {
        return password;
    }
    public String ViewActivities() {
        return null;
    }

    public String addAddress(String street, String town, String state, int zipCode, String country) {
        return "";
    }
}
