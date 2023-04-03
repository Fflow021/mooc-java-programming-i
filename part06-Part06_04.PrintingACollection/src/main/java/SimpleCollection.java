
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    
    public String toString() {
        String collectionElements = "";
        
        int i = 0; 
        for (String name: elements) {
            if (i < elements.size() - 1) {
                collectionElements = collectionElements + name + "\n"; 
            } else {
                collectionElements = collectionElements + name; 
            }
            i++;
        }
        
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        
        if (elements.size() == 1) {
            return "The collection " + this.name + " has 1 element:\n"
                    + collectionElements;
        }
        return "The collection " + this.name + " has " + elements.size()
                + " elements:\n" + collectionElements;
    }
}
