import java.util.Scanner;

//import org.omg.CORBA.FloatSeqHelper;

public class UI {
    boolean Run = true;
    static UI ui = new UI();
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] argc) {
        ui.run();
    }
    public void run() {
        System.out.println("Welcome to the Keyboard Smashers Summer Camp!");
        while(Run) {
            System.out.println("Please choose an option:\n- For sign in type \"in\"\n- For sign up type \"up\"\n- To quit type \"quit\"");
            String A = keyboard.nextLine();
            if(A.equalsIgnoreCase("in")) {
                ui.login();
            }
            else if(A.equalsIgnoreCase("up")) {
                ui.signUp();
            }
            else if(A.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye");
                Run = false;
            }
            else {
                System.out.println("Invalid input, please try again.");
            }
        }
    }
    public void login() {
        System.out.println("Please enter your email:");
        String logEmail = keyboard.nextLine();
        System.out.println("Please enter your password:");
        String logPassword = keyboard.nextLine();
        if(CampFacade.login(logEmail, logPassword) == true) {
            System.out.println("Hello "+ logEmail);
            ui.in();
        }
        else{
            System.out.println("Sorry, there is no login with that username/password. Please try again.");
            ui.login();
        }
        
    }

    public void signUp() {
        System.out.println("Please entrer your first name.");
        String name = keyboard.nextLine();
        System.out.println("Please entrer your last name.");
        String lastName = keyboard.nextLine();
        System.out.println("Please enter your userName.");
        String userName = keyboard.nextLine();
        System.out.println("Please entrer your email.");
        String email = keyboard.nextLine();
        System.out.println("Please entrer your password.");
        String password = keyboard.nextLine();
        System.out.println("please enter your phone number");
        String phoneNum = keyboard.nextLine();
        System.out.println("please enter your birthday");
        String birthday = keyboard.nextLine();

        UserList.addUser(name, lastName, email, password, phoneNum, birthday);

        //ui.run();
    }

    public void in() {
        System.out.println("Please enter your command:\nfor finding an activity by a key word enter \"activity\"");
        System.out.println("- For finding an activity by a key word enter \"activity\"");
        System.out.println("- For getting all the activities enter \"activities\"");
        System.out.println("- For viewing the schedule enter \"schedule\"");
        System.out.println("- For entering a review enter \"review\"");
        System.out.println("- For adding a child to your account enter \"addChild\"");
        System.out.println("- For signing your child up for a session enter \"registerChild\"");
        System.out.println("- For signing out enter \"signout\"");
        String command = keyboard.nextLine();

        if(command.equalsIgnoreCase("activity")) {
            System.out.println("please enter a key word");
            String keyWord = keyboard.nextLine();
            CampFacade.getActivityByKeyWord(keyWord);
            ui.in();

        }

        else if(command.equalsIgnoreCase("activities")) {
            ActivitiesList.getAllActivities();
            ui.in();

        }

        else if(command.equalsIgnoreCase("schedule")) {
            CampFacade.viewSchedule();
            ui.in();

        }

        else if(command.equalsIgnoreCase("review")) {
            System.out.println("please add your review");
            String review = keyboard.nextLine();
            SummerCamp.addReview(review);
            ui.in();

        }
        else if(command.equalsIgnoreCase("addChild")) {
            CampFacade.addChild();
            ui.run();
        }
        else if(command.equalsIgnoreCase("registerChild")) {
            CampFacade.registerChild();
            ui.run();
        }
        else if(command.equalsIgnoreCase("signout")) {
            ui.run();
        }
        else
            System.out.println("command not valid");
    }
}
