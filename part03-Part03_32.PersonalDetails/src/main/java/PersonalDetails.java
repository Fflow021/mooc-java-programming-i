
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0, count = 0, nameLength = 0, biggerName = 0;
        String name = "";
        
        while(true) {
            String input = scanner.nextLine();
            
            if(input.equals("")){
                break;
            }
            
            String[] parts = input.split(",");
            sum += Integer.valueOf(parts[1]);
            count++;
            nameLength = parts[0].length();
            
            if(biggerName < nameLength) {
                biggerName = nameLength;
                name = parts[0];
            }
        }
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + ((sum*1.0)/count));
    }
}
