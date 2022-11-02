import java.util.UUID;

/**
 * Abstract class for users
 */
public abstract class User {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;
    protected String phoneNum;
    protected String street;
    protected String town;
    protected String state;
    protected String zipCode;
    protected String country;
    protected String birthday;
    protected String gender;
    protected String id;
    /**
     * Constructor for creating a new user
     * @param firstName string of the user first name
     * @param lastName string of the user last name
     * @param email string of the user email
     * @param password string of the user password
     * @param phoneNum string of the user phone number
     * @param street string of the user street
     * @param town string of the user town
     * @param state string of the user state
     * @param zipCode string of the user zipcode
     * @param country string of the user country
     * @param birthday string of the user birthday
     * @param gender string of the user gender
     */
    public User(String firstName, String lastName, String email, String password, String phoneNum, String street, String town, String state, String zipCode, String country, String birthday, String gender) {
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
        this.id = UUID.randomUUID().toString();   
    }
    /**
     * gets first name of user
     * @return String first name
     */
    public String getfirstname() {
        return firstName;
    }
    /**
     * gets the lastname of the user
     * @return String lastname
     */
    public String getlastname() {
        return lastName;
    }
    /**
     * gets the phone number of user
     * @return String phone number
     */
    public String getphonenum() {
        return phoneNum;
    }
    /**
     * gets the birthday of the user
     * @return String birthday
     */
    public String getbirthday() {
       return birthday;
    }
    /**
     * gets the gender of the user
     * @return String gender
     */
    public String getGender() {
        return gender;
    }
    /**
     * gets the UUID of user
     * @return String id
     */
    public String getUUID() {
        return id;
    }
    /**
     * gets the email of the user
     * @return String email
     */
    public String getEmail() {
        return email;
    }
    /**
     * gets the password of the user
     * @return String password
     */
    public String getPassword() {
        return password;
    }
    
}