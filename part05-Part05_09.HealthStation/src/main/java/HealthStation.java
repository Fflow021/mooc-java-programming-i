
public class HealthStation {
    private int weighings;
    
    public int weigh(Person person) {
        weighings++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int currentWeight = person.getWeight();
        currentWeight++;
        
        person.setWeight(currentWeight);
    }
    
    public int weighings() {
        return weighings;
    }
}
