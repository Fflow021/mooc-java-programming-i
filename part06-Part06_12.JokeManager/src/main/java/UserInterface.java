import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager manager;
    
    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
        
    }
    
    public void start() {
        System.out.println("What a joke!");

        while (true) {
            
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
            
            if (command.equals("X")) {
                break;
            }
            
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                manager.addJoke(joke);
                
            } else if (command.equals("2")) {
                manager.drawJoke();

            } else if (command.equals("3")) {
                manager.printJokes();
                
            }
        }        
    }
}
