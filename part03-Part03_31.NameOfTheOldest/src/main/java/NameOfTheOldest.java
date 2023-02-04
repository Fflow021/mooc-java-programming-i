
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age,oldest = 0;
        String nameOfTheOldest = "";
        
        while(true) {
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            age = Integer.valueOf(parts[1]);
            
            if(age > oldest) {
                oldest = age;
                nameOfTheOldest = parts[0];
            }
        }
        System.out.println("Name of the oldest: " + nameOfTheOldest);
    }
}
