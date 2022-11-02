
import java.util.ArrayList;
import java.util.UUID;


public class Parent extends User{
    private boolean waiver;
    private ArrayList<String> children; //= new ArrayList<String>();
    private int numOfWeeks;
    private int price;
    private String id;
    
    /**
     * A constructor for parents in data reader
     * @param firstName A string of the first name of the parent
     * @param lastName A string of the last name of the parent
     * @param email A string of the email of the parent
     * @param password A string of the password of the parent
     * @param phoneNum A string of the phone number of the parent
     * @param birthday A string of the birthday of the parent
     * @param street A string of the street of the parent
     * @param town A string of the town of the parent
     * @param state A string of the state of the parent
     * @param zipCode A string of the zipcode of the parent
     * @param country A string of the country of the parent
     * @param gender A string of the gender of the parent
     * @param children An arraylist of children of the parent
     * @param id UUID of the parent
     */
    public Parent(String firstName, String lastName, String email, String password, String phoneNum, String birthday, String street, String town, String state, String zipCode, String country, String gender, ArrayList<String>children, String id) {
        super(firstName, lastName, email, password, phoneNum, birthday,street,town,state,zipCode,country,gender);
        this.children = children;
        this.id = id;
        
       
    }
    /**
     * Constructor for parent
     * @param firstName A string of the first name of the parent
     * @param lastName A string of the last name of the parent
     * @param email A string of the email of the parent
     * @param password A string of the password of the parent
     * @param phoneNum A string of the phone number of the parent
     * @param birthday A string of the birthday of the parent
     * @param street A string of the street of the parent
     * @param town A string of the town of the parent
     * @param state A string of the state of the parent
     * @param zipCode A string of the zipcode of the parent
     * @param country A string of the country of the parent
     * @param gender A string of the gender of the parent
     * @param waiver A boolean of the waiver for parent
     * @param numOfWeeks An int for the number of weeks
     * @param price An int for the price
     */
    public Parent(String firstName, String lastName, String email, String password, String phoneNum, String birthday, String street, String town, String state, String zipCode, String country, String gender, boolean waiver, int numOfWeeks, int price) {
        super(firstName, lastName, email, password, phoneNum, street, town, state, zipCode, country, birthday, gender);
        id = UUID.randomUUID().toString();
        children = new ArrayList<String>();
        this.numOfWeeks = 0;
        this.waiver = true;
        this.price = 0;
    }
    public void addChild(Child child){

    }

    public boolean signWaiver(boolean waiver){
        return waiver;
    }

    public void choseDates (int numOfWeeks){

    }

    public int displayPrice(){
        return 0;
    }

    public String getUUID() {
        return id;
    }
    public String getstreet(){
        return street;
    }
    public String gettown(){
        return town;

    }
    public String getZipCode() {
        return zipCode;
    }
    public String getstate(){
        return state;

    }
    public String getcountry(){
        return country;
    }
    public ArrayList<String> getChildID() {
      return children;
    }

}
