
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
                       
            String[] arrayWords = input.split(" ");
            for(String words: arrayWords) {
                if(words.contains("av")) {
                    System.out.println(words);
                }
            }
        }
    }
}
