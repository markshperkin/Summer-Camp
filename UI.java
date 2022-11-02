import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

//import org.omg.CORBA.FloatSeqHelper;

public class UI {
    static UI ui = new UI();
    Scanner keyboard = new Scanner(System.in);
    SummerCamp summerCamp = new SummerCamp();

    public static void main(String[] argc) {
        ui.run();
    }

    public void run() {
        System.out.println("Welcome to the Summer Camp!");
        System.out.println("Please choose an option:\n- For sign in type \"in\"\n- For sign up type \"up\"\n- To quit type \"quit\"");
        String A = keyboard.nextLine();
        if (A.equalsIgnoreCase("in")) {
            ui.login();
        } else if (A.equalsIgnoreCase("up")) {
            System.out.println("Are you signing up as a counselor, admin, or guardian?");
            String signUpChoice = keyboard.nextLine();
            if (signUpChoice.equalsIgnoreCase("counselor")){
                ui.signUpCounselor();
            }
            else if (signUpChoice.equalsIgnoreCase("admin")){
                ui.signUpAdmin();
            }
            else if (signUpChoice.equalsIgnoreCase("guardian")){
                ui.signUpGuardian();
            }
            else{
                System.out.println("Try again.");
            }
        } else if (A.equalsIgnoreCase("quit")) {
            System.out.println("Goodbye");
            System.exit(0);
        } else {
            System.out.println("Invalid input, please try again.");
            ui.run();
        }
    }

    public void login() {
        System.out.println("Are you a guardian, counselor, or an admin?");
        String typeUser = keyboard.nextLine();

        System.out.println("Please enter your email:");
        String logEmail = keyboard.nextLine();

        System.out.println("Please enter your password:");
        String logPassword = keyboard.nextLine();

        if (CampFacade.login(logEmail, logPassword, typeUser) == true) {
            System.out.println("Hello " + logEmail);
            if (typeUser.equalsIgnoreCase("guardian")){
                ui.inGuardian();
            }
            if (typeUser.equalsIgnoreCase("counselor")){
                ui.inCounselor();
    
            }
            if (typeUser.equalsIgnoreCase("admin")){
                ui.inAdmin();
            }
            else{
                System.out.println("Please try again.");
                ui.login();
            }
            
        } 
        else {
            System.out.println("Sorry, there is no login with that username/password. Please try again.");
            ui.run();
        }

    }

    public void signUpGuardian() {
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
        
        CampFacade.signUp(firstName, lastName, email, password, phoneNum, birthday, street, town, state, zipCode, country, gender,"guardian");
        ui.inGuardian();
    }
    
    public void signUpCounselor() {
        System.out.println("Please enter your first name.");
        String counselorFirstName = keyboard.nextLine();
        System.out.println("Please enter your last name.");
        String counselorLastName = keyboard.nextLine();
        System.out.println("Please enter your email.");
        String counselorEmail = keyboard.nextLine();
        System.out.println("Please enter your password.");
        String counselorPassword = keyboard.nextLine();
        System.out.println("Please enter your phone number");
        String counselorPhoneNum = keyboard.nextLine();
        System.out.println("Please enter your birthday");
        String counselorBirthday = keyboard.nextLine();
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
        String counselorGender = keyboard.nextLine();
        System.out.println("Please enter your shirt size.");
        String counselorShirtSize = keyboard.nextLine();
        System.out.println("Your emergency contact:");
                System.out.println("- First Name:");                
                String emergencyFirstName = keyboard.nextLine();
                System.out.println("- Last Name:");
                String emergencyLastName = keyboard.nextLine();
                System.out.println("- Phone Number:");
                String emergencyPhoneNum = keyboard.nextLine();
                System.out.println("- Email:");
                String emergencyEmail = keyboard.nextLine();
                System.out.println("- Relationship to child:");
                String emergencyRelationship = keyboard.nextLine();
                Contact contact = new Contact(emergencyFirstName, emergencyLastName, emergencyPhoneNum, emergencyEmail, emergencyRelationship);
                ArrayList<Contact> emergencyContacts = new ArrayList();
                emergencyContacts.add(contact);
                System.out.println("Would you like to add another emergency contact? Enter 'yes' or 'no'");
                String emergencyDecision = keyboard.nextLine();
                    if (emergencyDecision.equalsIgnoreCase("yes")){
                        boolean emergencyGo = true;
                        while (emergencyGo == true){
                            System.out.println("New contact:");
                            System.out.println("- First Name:");                
                            emergencyFirstName = keyboard.nextLine();
                            System.out.println("- Last Name:");
                            emergencyLastName = keyboard.nextLine();
                            System.out.println("- Phone Number:");
                            emergencyPhoneNum = keyboard.nextLine();
                            System.out.println("- Email:");
                            emergencyEmail = keyboard.nextLine();
                            System.out.println("- Relationship to child:");
                            emergencyRelationship = keyboard.nextLine();
                            contact = new Contact(emergencyFirstName, emergencyLastName, emergencyPhoneNum, emergencyEmail, emergencyRelationship);
                            emergencyContacts.add(contact);
                            System.out.println("Would you like to add another emergency contact? Enter 'yes' or 'no'");
                            String decision2 = keyboard.nextLine();
                            if (decision2.equalsIgnoreCase("no")){
                                emergencyGo = false;
                            }
                        }
                    }
                    ArrayList<Medication> medications = new ArrayList();
                    System.out.println("Do you have a medication to add? Enter 'yes' or 'no'");
                    String medicationCheck = keyboard.nextLine();
                    if (medicationCheck.equalsIgnoreCase("yes")){
                        boolean medicationGo = true;
                        while (medicationGo == true){
                            System.out.println("New Medication:");
                            System.out.println("- Name:");                
                            String medicationName = keyboard.nextLine();
                            System.out.println("- Time:");
                            String medicationTime = keyboard.nextLine();
                            System.out.println("- Doseage:");
                            String medicationDosage = keyboard.nextLine();
                            Medication medication = new Medication(medicationName, medicationTime, medicationDosage);
                            medications.add(medication);
                            System.out.println("Would you like to add another medication? Enter 'yes' or 'no'");
                            String decision2 = keyboard.nextLine();
                            if (decision2.equalsIgnoreCase("no")){
                                medicationGo = false;
                            }
                        }
                    }
                    ArrayList<String> allergies = new ArrayList();
                    System.out.println("Do you have an allergy to add? Enter 'yes' or 'no'");
                    String allergyCheck = keyboard.nextLine();
                    if (allergyCheck.equalsIgnoreCase("yes")){
                        boolean allergyGo = true;
                        while (allergyGo == true){
                            System.out.println("New Allergy:");
                            System.out.println("- Name:");
                            String allergyName = keyboard.nextLine();                
                            allergies.add(allergyName);
                            System.out.println("Would you like to add another allergy? Enter 'yes' or 'no'");
                            String decision2 = keyboard.nextLine();
                            if (decision2.equalsIgnoreCase("no")){
                                allergyGo = false;
                            }
                        }
                    }

            System.out.println("Enter a few sentences about yourself:");
            String aboutMe = keyboard.nextLine();
            Counselor counselorAdded = new Counselor (UUID.randomUUID().toString(), counselorFirstName, counselorLastName, counselorEmail, counselorPassword, counselorPhoneNum, counselorBirthday, counselorGender, counselorShirtSize, street, town, state, zipCode, country, aboutMe, emergencyContacts, medications, allergies);
            CampFacade.addCounselor(counselorAdded);
            ui.inCounselor();

    }
    

    public void signUpAdmin(){
        System.out.println("Please enter your first name.");
        String counselorFirstName = keyboard.nextLine();
        System.out.println("Please enter your last name.");
        String counselorLastName = keyboard.nextLine();
        System.out.println("Please enter your email.");
        String counselorEmail = keyboard.nextLine();
        System.out.println("Please enter your password.");
        String counselorPassword = keyboard.nextLine();
        System.out.println("Please enter your phone number");
        String counselorPhoneNum = keyboard.nextLine();
        System.out.println("Please enter your birthday");
        String counselorBirthday = keyboard.nextLine();
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
        String counselorGender = keyboard.nextLine();
        System.out.println("Please enter your shirt size.");
        String counselorShirtSize = keyboard.nextLine(); 
        System.out.println("What is the name of your summer camp?");
        String campName = keyboard.nextLine();
        ui.inAdmin();
    }

    public void inGuardian() {
        boolean run1 = true;
        while (run1) {
            System.out.println("Please enter your command:\nfor finding an activity by a key word enter \"activity\"");
            System.out.println("- For viewing all the activities enter \"all activities\"");
            System.out.println("- For viewing an example schedule enter \"example schedule\"");
            System.out.println("- For viewing a list of each weeks theme enter \"view themes\"");
            System.out.println("- For entering a review enter \"enter review\"");
            System.out.println("- For reading reviews enter \"read reviews\"");
            System.out.println("- For adding a child to your account enter \"add child\"");
            System.out.println("- For viewing a child's profile on your account enter \"view child\"");
            System.out.println("- For signing your child up for a session enter \"register child\"");
            System.out.println("- For signing out and quitting the program, enter \"signout\"");
            String command = keyboard.nextLine();

            

             if (command.equalsIgnoreCase("all activities")) {
                CampFacade.viewAllActivities();
            }

            else if (command.equalsIgnoreCase("example schedule")) {
                CampFacade.viewSchedule();
            }
            else if (command.equalsIgnoreCase("view themes")){
                ui.allThemes();
            }
            else if (command.equalsIgnoreCase("enter review")) {
                System.out.println("Please add your review:");
                String review = keyboard.nextLine();
                SummerCamp.addReview(review);
            } 
            else if (command.equalsIgnoreCase("read reviews")) {
                CampFacade.readReviews();
            }
            else if (command.equalsIgnoreCase("add child")) {
                System.out.println("Child's first name:");
                String childFirstName = keyboard.nextLine();
                System.out.println("Child's last name:");
                String childLastName = keyboard.nextLine();
                System.out.println("Child's gender:");
                String childGender = keyboard.nextLine();
                System.out.println("Child's birthday:");
                String childBirthday = keyboard.nextLine();
                System.out.println("Child's shirt size (s/m/l/xl):");
                String childShirtSize = keyboard.nextLine();
                System.out.println("Child's emergency contact:");
                System.out.println("- First Name:");                
                String emergencyFirstName = keyboard.nextLine();
                System.out.println("- Last Name:");
                String emergencyLastName = keyboard.nextLine();
                System.out.println("- Phone Number:");
                String emergencyPhoneNum = keyboard.nextLine();
                System.out.println("- Email:");
                String emergencyEmail = keyboard.nextLine();
                System.out.println("- Relationship to child:");
                String emergencyRelationship = keyboard.nextLine();
                Contact contact = new Contact(emergencyFirstName, emergencyLastName, emergencyPhoneNum, emergencyEmail, emergencyRelationship);
                ArrayList<Contact> emergencyContacts = new ArrayList();
                emergencyContacts.add(contact);
                System.out.println("Would you like to add another emergency contact? Enter 'yes' or 'no'");
                String emergencyDecision = keyboard.nextLine();
                    if (emergencyDecision.equalsIgnoreCase("yes")){
                        boolean emergencyGo = true;
                        while (emergencyGo == true){
                            System.out.println("New contact:");
                            System.out.println("- First Name:");                
                            emergencyFirstName = keyboard.nextLine();
                            System.out.println("- Last Name:");
                            emergencyLastName = keyboard.nextLine();
                            System.out.println("- Phone Number:");
                            emergencyPhoneNum = keyboard.nextLine();
                            System.out.println("- Email:");
                            emergencyEmail = keyboard.nextLine();
                            System.out.println("- Relationship to child:");
                            emergencyRelationship = keyboard.nextLine();
                            contact = new Contact(emergencyFirstName, emergencyLastName, emergencyPhoneNum, emergencyEmail, emergencyRelationship);
                            emergencyContacts.add(contact);
                            System.out.println("Would you like to add another emergency contact? Enter 'yes' or 'no'");
                            String decision2 = keyboard.nextLine();
                            if (decision2.equalsIgnoreCase("no")){
                                emergencyGo = false;
                            }
                        }
                    }
                    ArrayList<Medication> medications = new ArrayList();
                    System.out.println("Does your child have a medication to add? Enter 'yes' or 'no'");
                    String medicationCheck = keyboard.nextLine();
                    if (medicationCheck.equalsIgnoreCase("yes")){
                        boolean medicationGo = true;
                        while (medicationGo == true){
                            System.out.println("New Medication:");
                            System.out.println("- Name:");                
                            String medicationName = keyboard.nextLine();
                            System.out.println("- Time:");
                            String medicationTime = keyboard.nextLine();
                            System.out.println("- Doseage:");
                            String medicationDosage = keyboard.nextLine();
                            Medication medication = new Medication(medicationName, medicationTime, medicationDosage);
                            medications.add(medication);
                            System.out.println("Would you like to add another medication? Enter 'yes' or 'no'");
                            String decision2 = keyboard.nextLine();
                            if (decision2.equalsIgnoreCase("no")){
                                medicationGo = false;
                            }
                        }
                    }
                    ArrayList<String> allergies = new ArrayList();
                    System.out.println("Does your child have an allergy to add? Enter 'yes' or 'no'");
                    String allergyCheck = keyboard.nextLine();
                    if (allergyCheck.equalsIgnoreCase("yes")){
                        boolean allergyGo = true;
                        while (allergyGo == true){
                            System.out.println("New Allergy:");
                            System.out.println("- Name:");
                            String allergyName = keyboard.nextLine();                
                            allergies.add(allergyName);
                            System.out.println("Would you like to add another allergy? Enter 'yes' or 'no'");
                            String decision2 = keyboard.nextLine();
                            if (decision2.equalsIgnoreCase("no")){
                                allergyGo = false;
                            }
                        }
                    }
                    Child childAdded = new Child (UUID.randomUUID().toString(), childFirstName, childLastName, childGender, childBirthday, childShirtSize, emergencyContacts, medications, allergies);
                    CampFacade.addChild(childAdded);
                }
                else if (command.equalsIgnoreCase("view child")) {
                    System.out.println("Enter the child's first name you wish to view:");
                    String viewFirstName = keyboard.nextLine();
                    System.out.println("Enter the child's last name you wish to view:");
                    String viewLastName = keyboard.nextLine();
                    CampFacade.viewChild(viewFirstName, viewLastName);
                } 
                else if (command.equalsIgnoreCase("register child")) {
                    System.out.println("Enter the child's first name you wish to register:");
                    String registerFirstName = keyboard.nextLine();
                    System.out.println("Enter the child's last name you wish to register:");
                    String registerLastName = keyboard.nextLine();
                    System.out.println("Enter the session you wish for your child to register (just enter the number):");
                    System.out.println("Session 1: 06/18/2023 - 07/01/2023");
                    System.out.println("Session 2: 07/02/2023 - 07/08/2023");
                    System.out.println("Session 3: 07/09/2023 - 07/15/2023");
                    System.out.println("Session 4: 07/16/2023 - 07/22/2023");
                    System.out.println("Session 5: 07/23/2023 - 07/29/2023");
                    System.out.println("Session 6: 07/30/2023 - 08/05/2023");
                    System.out.println("Session 7: 08/06/2023 - 08/12/2023");
                    System.out.println("Session 8: 08/13/2023 - 08/19/2023");
                    System.out.println("Session 9: 08/20/2023 - 08/26/2023");
                    int sessionChoice = keyboard.nextInt();
                    CampFacade.registerChild(registerFirstName, registerLastName, sessionChoice );
                } 
                else if (command.equalsIgnoreCase("signout")) {
                    System.out.println("See you again soon!");
                    run1 = false;
                } 
                else
                    System.out.println("command not valid");
            }
    }

    public void inCounselor(){
        boolean run2 = true;
        while (run2) {
            System.out.println("Please enter your command:");
            System.out.println("- For printing out your cabin's roster enter \"print roster\"");
            System.out.println("- For printing out camper's information enter  \"print info\"");
            System.out.println("- For printing out your week's activities enter \"print activities\"");
            System.out.println("- For signing out and quitting the program, enter \"signout\"");
            String counselorChoice = keyboard.nextLine();
            if (counselorChoice.equalsIgnoreCase("print roster")){
                CampFacade.getCabin();
            }
            else if (counselorChoice.equalsIgnoreCase("print info")){
                CampFacade.getCabinCampers();
            }
            else if (counselorChoice.equalsIgnoreCase("print activites")){
                CampFacade.viewSchedule();
            }
            else if (counselorChoice.equalsIgnoreCase("signout")){
                System.out.println("See you next time!");
                run2 = false;
            }
        }

    }

    public void inAdmin(){
        System.out.println("Please enter your command:");
        System.out.println("- For creating a summer camp enter \"create camp\"");
        System.out.println("- For viewing a cabin's schedule enter  \"view schedule\"");
        String adminChoice = keyboard.nextLine();
        if (adminChoice.equalsIgnoreCase("create camp")){
            System.out.println("Please enter the name of your summer camp to create:");
            String campName = keyboard.nextLine();
            System.out.println("Enter the names of your summer camp themes:");
            for (int x = 0; x < 9; x++){
                System.out.println("Session " + x + ":");
                String sessionTheme = keyboard.nextLine();
            }
            System.out.println("How many cabins will you have?");
            int numOfCabins = keyboard.nextInt();
            CampFacade.getCabin();
        }
        else if (adminChoice.equalsIgnoreCase("view schedule")){
            System.out.println("Which cabin number would you like to view? Enter a number 1-6.");
            int cabinViewChoice = keyboard.nextInt();
            CampFacade.getOneCabin(cabinViewChoice); 
        }
        
    }

    public void allThemes(){
        System.out.println("Session 1: 06/18/2023 - 07/01/2023: HAWAIIAN");
        System.out.println("- It's hawaiian week! Let's drink out of coconuts, put on some lei's and dance at the luau!");
        System.out.println("Session 2: 07/02/2023 - 07/08/2023: ROCKSTARS");
        System.out.println("- Music brings people together, so let's bring it to our summer camp! Let's rock out!");
        System.out.println("Session 3: 07/09/2023 - 07/15/2023: NINJA WARRIORS");
        System.out.println("- Have you ever wanted to be a ninja? Now you can! Dress up like a ninja and learn how to fight like one!");
        System.out.println("Session 4: 07/16/2023 - 07/22/2023: WILLY WONKA");
        System.out.println("- If Willy Wonka is one of your favorite movies, this week is for you! Have all the candy you could imagine this week!");
        System.out.println("Session 5: 07/23/2023 - 07/29/2023: HOLLY WOOD");
        System.out.println("- Lights, Cameras, Action! Experience life as if you were a Hollywood celebrity.");
        System.out.println("Session 6: 07/30/2023 - 08/05/2023: LEGOS");
        System.out.println("- Who doesn't love to build a good lego set? This week, spend all the time you want experimenting with legos and building sets!");
        System.out.println("Session 7: 08/06/2023 - 08/12/2023: COPS AND ROBBERS");
        System.out.println("- Fan favorite week! Lots of fun games to play!");
        System.out.println("Session 8: 08/13/2023 - 08/19/2023: SHARK TANK");
        System.out.println("- Let's learn about sharks! With real life shark experts, let's learn about one of the earth's most interesting species.");
        System.out.println("Session 9: 08/20/2023 - 08/26/2023: SMORES");
        System.out.println("- Last but not least, let's finish off the summer with good ol' fashioned smores.");
    }
}
