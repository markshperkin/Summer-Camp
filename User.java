import java.util.UUID;

public abstract class User {
    protected String firstName;
    protected String lastName;
    protected static String email;
    protected static String password;
    protected String phoneNum;
    protected String  street;
    protected String town;
    protected String state;
    protected static String zipCode;
    protected String country;
    protected String birthday;
    protected String gender;
    protected UUID id;
    

    public User(String firstName, String lastName, String email, String password, String phoneNum, String birthday,String street, String town, String state, String zipCode, String country, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNum = phoneNum;
        this.birthday = birthday;
        this.street =street;
        this.town=town;
        this.state=state;
        this.zipCode=zipCode;
        this.country=country;
        this.gender=gender;
        this.id = UUID.randomUUID();
        
    }

    // public static void createUser(String firstName,String lastName,String email,String password, String phoneNum, String birthday) {
    //     User user = new User(firstName, lastName, email, password, phoneNum, birthday);
    // }
    public String getfirstname()
    {
        return firstName;

    }
    public String getlastname()
    {
        return lastName;

    }
    public String getphonenum()
    {
        return phoneNum;

    
    }
    public String getbirthday()
    {
       return birthday;

    }
    public String getgender()
    {
        return gender;

    }
    public UUID getUUID() {
        return id;
    }

    public static String getEmail() {
        return email;
    }

    public static String getPassword() {
        return password;
    }
    public String ViewActivities() {
        return null;
    }

    public String addAddress(String street, String town, String state, String zipCode, String country) {
        return "";
    }
}
