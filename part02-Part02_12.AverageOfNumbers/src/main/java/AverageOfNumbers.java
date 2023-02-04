
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cont = 0;
        int sum = 0;
        double average = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            cont = cont + 1;
            sum = number + sum;
        }
        average = sum*(1.0)/cont;
        System.out.println("Average of the numbers: " + average);
    }
}
