
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        //list of "person" objects called "records"
        ArrayList<Person> records = readRecordsFromFile(file);
        
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        //initializing scanner for the file
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            //read the file until has no lines
            while(fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                
                //split row by comma and save it in String name and int age
                String[] parts = row.split(",");
                String name  = parts[0];
                int age = Integer.valueOf(parts[1]);
                
                //add to the persons list a new object with "name" and "age" variables
                persons.add(new Person(name, age));
            }//end of while
        } catch (IOException ex) {
            Logger.getLogger(StoringRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
        return persons;

    }
}
