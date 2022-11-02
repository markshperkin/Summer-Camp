public class Contact {
    
    public String firstName;
    public String lastName;
    public String phoneNum;
    public String email;
    public String relationship;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public String getRelationship() {
        return relationship;
    }

    public Contact(String firstName, String lastName, String phoneNum, String email, String relationship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.email = email;
        this.relationship = relationship;
    }


    

}
