public class Contact {
    
    public String firstName;
    public String lastName;
    public String phoneNum;
    public String email;
    public String relationship;

    /**
     * Constructor of contact
     * @param firstName A string of contact first name
     * @param lastName A string of contact last name
     * @param phoneNum A string of contact phone number
     * @param email A string of contact email
     * @param relationship A string of contact relationship
     */
    public Contact(String firstName, String lastName, String phoneNum, String email, String relationship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.email = email;
        this.relationship = relationship;
    }
    /**
     * gets the first name of contact
     * @return String first name
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * gets the last name of contact
     * @return String last name
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * gets the phone number of contact
     * @return String phone number
     */
    public String getPhoneNum() {
        return phoneNum;
    }
    /**
     * gets the email of contact
     * @return String email
     */
    public String getEmail() {
        return email;
    }
    /**
     * gets the relationship of contact
     * @return String relationship
     */
    public String getRelationship() {
        return relationship;
    }

}
