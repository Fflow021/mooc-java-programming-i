import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner ) {
        this.list = list;
        this.scanner = scanner;
        
    }
    
    public void start() {
        while(true) {
            System.out.println("Command:");
            String commandInput = scanner.nextLine();
            
            if (commandInput.equals("add")) {
                System.out.println("To add:");
                String taskInput = scanner.nextLine();
                list.add(taskInput);
            }
            
            if (commandInput.equals("remove")) {
                System.out.println("Wich one is removed?");
                int removeInput = Integer.valueOf(scanner.nextLine());
                list.remove(removeInput);
            }
            
            if (commandInput.equals("list")) {
                list.print();
            }
            
            if (commandInput.equals("stop")) {
                break;
            }
        }
    }
}
