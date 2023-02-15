
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.
        try (Scanner fileSc = new Scanner(Paths.get(file))) {  //implementing scan to scan the file
            while(fileSc.hasNextLine()) { //loop until the end of the file
                String row = fileSc.nextLine(); //read the lines of the file
                list.add(row); //add them to the list "list"
            }                  //bc in the next while we will compare the input to the lines that were in the file but now are in the list
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
        
        System.out.println("");

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");
    }
}
