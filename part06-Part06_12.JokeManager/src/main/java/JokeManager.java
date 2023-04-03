import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
        
    }
    
    public void addJoke(String joke) {
        jokes.add(joke);
        
    }
    
    public String drawJoke() {
        System.out.println("Drawing a joke.");
        String theJoke = "";
                if (jokes.isEmpty()) {
                    theJoke = "Jokes are in short supply.";
                    
                } else {
                    Random draw = new Random();
                    int index = draw.nextInt(jokes.size());
                    System.out.println(jokes.get(index));
                    theJoke = jokes.get(index);
                }
        return theJoke;
    }
    
    public void printJokes() {
        System.out.println("Printing the jokes.");
            for (String joke : jokes) {
                System.out.println(joke);
            }        
    }
    
}
