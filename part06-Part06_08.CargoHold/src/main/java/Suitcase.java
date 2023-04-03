import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;
    
    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }
    
    public int totalWeight() {
        int totW = 0;
        for (Item item: items) {
            totW += item.getWeight();
        }
        
        return totW;
    }
    
    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maximumWeight) {
            this.items.add(item);
        }
    }
    
    public void printItems() {
        for (Item item: items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        if(items.isEmpty()) {
            return null;
        }
        
        Item rtrnHeaviest = this.items.get(0);
        
        for (Item itm: this.items) {
            if(rtrnHeaviest.getWeight() < itm.getWeight()) {
                rtrnHeaviest = itm;
            }
        }
        
        return rtrnHeaviest;
    }
    
        public String toString() {
        String weightOutput = " (" + this.totalWeight() + " kg)";
        if(items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if(items.size() ==  1) {
            return "1 item " + weightOutput;
        }
        
        return items.size() + " items " + weightOutput;
    }
}
