public class Director {
    private Child camper;

    public Director(String fname, String lname, String email, String password, String phoneNum, String street,
            String town, String zipCode, String state, String country, String birthday) {
            
        this.fname= fname;
        
    }

    public String viewCamper(Child camper) {
        return "";
    }

    public int checkMoney() {
        return 0;
    }
}
