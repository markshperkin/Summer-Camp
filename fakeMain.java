import java.util.UUID;

import java.util.UUID;
import java.util.*;
public class fakeMain {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println(DataReader.getAllChild());
    System.out.println(DataReader.getAllCounselors());
    //System.out.println(DataReader.getAllDirectors());
    System.out.println(DataReader.getAllParents().size());
    //System.out.println(DataReader.getAllCabins());

    System.out.println("Please enter your first name.");
        String firstName = keyboard.nextLine();
        System.out.println("Please enter your last name.");
        String lastName = keyboard.nextLine();
        System.out.println("Please enter your email.");
        String email = keyboard.nextLine();
        System.out.println("Please enter your password.");
        String password = keyboard.nextLine();
        System.out.println("Please enter your phone number");
        String phoneNum = keyboard.nextLine();
        System.out.println("Please enter your birthday");
        String birthday = keyboard.nextLine();
        System.out.println("Please enter your address");
        System.out.println("Street:");
        String street = keyboard.nextLine();
        System.out.println("Town:");
        String town = keyboard.nextLine();
        System.out.println("State:");
        String state = keyboard.nextLine();
        System.out.println("ZipCode:");
        String zipCode = keyboard.nextLine();
        System.out.println("Country:");
        String country = keyboard.nextLine();
        System.out.println("Please enter your gender.");
        String gender = keyboard.nextLine();

        CampFacade.signUp(firstName, lastName, email, password, phoneNum, birthday, street, town, state, zipCode, country, gender, "guardian");
        
  }
}