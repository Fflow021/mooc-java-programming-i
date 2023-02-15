
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("First Name:");
            String fName = scanner.nextLine();
            if(fName.isEmpty()) {
                break;
            }
            System.out.println("Last Name:");
            String lName = scanner.nextLine();
            
            System.out.println("Identification number:");
            String id = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(fName, lName, id));
            
        }
        for(PersonalInformation pI: infoCollection) {
            System.out.println(pI.getFirstName() + " " +pI.getLastName());
        }
    }
}
