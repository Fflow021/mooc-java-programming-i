
import java.util.ArrayList;

public class BirdList {
    ArrayList<Bird> birdList;
    
    public BirdList() {
        this.birdList = new ArrayList<>();
    }
    
    public void addBird(Bird bird) {
        this.birdList.add(bird);
        
    }
    
    public void printList() {
        if (birdList.isEmpty()) {
            System.out.println("No birds in the list!");
        } else {
            for (Bird bird: birdList) {
                System.out.println(bird);
            }            
        }
    }
    
    public void observationBird(String name) {
        for(Bird bird: birdList) {
            if(bird.getName().equals(name)) {
                bird.obervations();
            }
        }
    }
    
    public void findBird(String name) {
        for(Bird bird: birdList) {
            if(bird.getName().equals(name)) {
                System.out.println(bird);
            } else {
                System.out.println("Not a bird!");
            }
        }
    }
}
