
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String pieces[];
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            //String pieces[] = input.split(" ");
            
            pieces = input.split(" ");
            
            for(String words: pieces) {
                System.out.println(words);
            }
        }
    }
}