
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String valueS = scan.nextLine();
        System.out.println("Give an integer: ");
        int valueI = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double: ");
        double valueD = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean: ");
        boolean valueB = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + valueS);
        System.out.println("You gave the integer " + valueI);
        System.out.println("You gave the double "  + valueD);
        System.out.println("You gave the boolean " + valueB);

    }
}
