import java.util.Scanner;

public class UI {
    static UI ui = new UI();
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] argc) {
        ui.run();
    }
    public void run() {
        boolean Run = true;
        while(Run) {
            System.out.println("welcome to the Keyboard Smashers Summer Camp");
            System.out.print("please choose an option\nfor sign in type \"in\"\nfor sign up type \"up\"\nto quit type \"quit\"");
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

    }

    public void signUp() {

    }
}
