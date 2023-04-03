
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        //se "meals" não conter *meal*, add *meal* no "meals"
        if(!(meals.contains(meal))) {
            this.meals.add(meal);
        }
    }
    
    public void printMeals() {
        for (String meal: meals) {
            System.out.println(meal);
        }
    }
    
    public void clearMenu() {
        meals.clear();
    }
}
