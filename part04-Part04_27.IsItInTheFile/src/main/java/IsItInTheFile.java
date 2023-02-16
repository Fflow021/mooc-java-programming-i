
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        int i = 0;
        try (Scanner fileSc = new Scanner(Paths.get(file))) {
            while(fileSc.hasNextLine()) {
                String row = fileSc.nextLine();
                
                if(!row.contains(searchedFor)) {
                    continue;
                }
                
                i++;
            }//end of while
        } catch (IOException ex) {
            System.out.println("Reading the file " + file + "failed.");
        }
        
        if(i == 0) {
            System.out.println("Not found.");
        } else {
            System.out.println("Found!");
        }
    }
}
