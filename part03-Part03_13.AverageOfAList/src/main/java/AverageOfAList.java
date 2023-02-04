
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList <Integer> list = new ArrayList<>();
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        
        int quantity = 0;
        int sum = 0;
        for (int number: list){
            sum = sum + number;
            quantity++;
            //System.out.println(number);
            //System.out.println(quantity);
        }
        
        double avg  = sum/(quantity*1.0);
        System.out.println("Average: " + avg);
    }
}
