import java.util.Scanner;

import org.omg.CORBA.FloatSeqHelper;

public class UI {
    boolean Run = true;
    static UI ui = new UI();
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] argc) {
        ui.run();
    }
    public void run() {
        while(Run) {
            System.out.println("welcome to the Keyboard Smashers Summer Camp");
            System.out.println("please choose an option\nfor sign in type \"in\"\nfor sign up type \"up\"\nto quit type \"quit\"");
            String A = keyboard.nextLine();
            if(A.equalsIgnoreCase("in")) {
                ui.login();
            }
            else if(A.equalsIgnoreCase("up")) {
                ui.signUp();
            }
            else if(A.equalsIgnoreCase("quit")) {
                System.out.println("goodbey");
                Run = false;
            }
            else {
                System.out.println("not valid, please try again");
                ui.run();
            }
        }
    }
    public void login() {
        System.out.println("please enter your username");
        String logUser = keyboard.nextLine();
        System.out.println("please enter your password");
        String logPassword = keyboard.nextLine();
        if(CampFacade.login(logUser, logPassword) == true) {
            System.out.println("hello "+ logUser);
            ui.in();
        }
        ui.run();
    }

    public void signUp() {
        System.out.println("please entrer your name");
        String name = keyboard.nextLine();
        System.out.println("please entrer your last name");
        String lastName = keyboard.nextLine();
        System.out.println("please entrer your userName");
        String userName = keyboard.nextLine();
        System.out.println("please entrer your email");
        String email = keyboard.nextLine();
        System.out.println("please entrer your password");
        String password = keyboard.nextLine();

        CampFacade.signUp(name, lastName, userName, email, password);

        ui.run();
    }

    public void in() {
        System.out.println("please enter your command\nfor finding an activity by a key word enter \"activity\"");
        System.out.println("for getting all the activities enter \"activities\"");
        System.out.println("for viewing the schedule enter \"schedule\"");
        System.out.println("for entering a review enter \"review\"");
        System.out.println("for signing out enter \"signout\"");
        String command = keyboard.nextLine();

        if(command.equalsIgnoreCase("activity")) {
            System.out.println("please enter a key word");
            String keyWord = keyboard.nextLine();
            CampFacade.getActivityByKeyWord(keyWord);
            ui.in();

        }

        else if(command.equalsIgnoreCase("activities")) {
            CampFacade.getAllActivity();
            ui.in();

        }

        else if(command.equalsIgnoreCase("schedule")) {
            CampFacade.viewSchedule();
            ui.in();

        }

        else if(command.equalsIgnoreCase("review")) {
            CampFacade.addReview();
            ui.in();

        }

        else if(command.equalsIgnoreCase("signout")) {
            ui.run();
        }
        else
            System.out.println("command not valid");
    }
}
