
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int container1 = 0;
        int container2 = 0;

        while (true) {

            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
            
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount > 0) {
                if (container1 + amount <= 100) {
                    container1 = container1 + amount;

                } else if (container1 + amount >= 100) {
                    container1 = 100;

                }
                
            } else if (command.equals("move") && amount > 0) {
                if (amount >= container1) {
                    container2 += container1;
                    container1 = 0;
                } else {
                    container2 += amount;
                    container1 -= amount;
                }
                
                if(container2 > 100) {
                    container2 = 100;
                }
            } else if (command.equals("remove") && container2 > 0) {
                if (amount > container2) {
                    container2 = 0;
                } else {
                    container2 -= amount; 
                }
            }
        }
    }

}
