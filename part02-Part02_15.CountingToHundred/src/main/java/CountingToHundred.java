
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int start = Integer.valueOf(scanner.nextLine());
        
        //POSSIVEL SOLUÇÃO
        //while (numberToPrint <= 100) {
        //System.out.println(numberToPrint);
        //numberToPrint++;
        
        for (;start <= 100; start++) {
            System.out.println(start);
        }
    }
}
