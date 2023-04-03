import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> holds;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.holds = new ArrayList<>();
        
    }
    
    public int totalWeight() {
        int totW = 0;
        for(Suitcase suitcase: holds) {
            totW += suitcase.totalWeight();
        }
        
        return totW;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(totalWeight() + suitcase.totalWeight() <= maxWeight) {
            holds.add(suitcase);
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase: holds) {
            suitcase.printItems();
        }
    }
    
    public String toString() {
        String weightOutput = " (" + totalWeight() + " kg)";
        return holds.size() + " suitcases " + weightOutput;
    }
}
