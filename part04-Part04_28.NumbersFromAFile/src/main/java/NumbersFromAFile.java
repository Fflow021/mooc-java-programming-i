
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File?");
        String file = scanner.nextLine();
        System.out.println("Lower bound?");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound?");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int range = 0;
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while(fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                int integer = Integer.valueOf(row);
                if(integer <= upperBound && integer >= lowerBound) {
                    range++;
                } //end of if
            }//end of while
        } catch (IOException ex) {
            Logger.getLogger(NumbersFromAFile.class.getName()).log(Level.SEVERE, null, ex);
        } //end of catch
        
        System.out.println("Numbers: " + range);
    }

}
