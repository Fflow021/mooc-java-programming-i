
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        
        Scanner scan = new Scanner(System.in);
        BirdList birdList = new BirdList();
        
        System.out.println("== Command List == \nAdd - adds a bird"
                + "\nObservation - adds an observation"
                + "\nAll - prints all birds"
                + "\nOne - prints one bird"
                + "\nQuit - end the program");
        
        System.out.println("Command: ");
        
        while(true) {
            
            String input = scan.nextLine();
            
            if (input.equals("Quit")) {
                break;
            }
            
            if (input.equals("Add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in latin:");
                String nameInLatin = scan.nextLine();
                
                Bird bird = new Bird(name,nameInLatin);
                birdList.addBird(bird);
                
            }
            
            if (input.equals("All")) {
                birdList.printList();
                
            }
            
            if (input.equals("Observation")) {
                System.out.println("Bird?");
                String birdSearch = scan.nextLine();
                birdList.observationBird(birdSearch);
            }
            
            if (input.equals("One")) {
                System.out.println("Bird?");
                String birdSearch = scan.nextLine();
                birdList.findBird(birdSearch);
            }
        }
    }

}
