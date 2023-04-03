import java.util.ArrayList;

public class Room {
    private ArrayList<Person> room;
    
    public Room() {
        this.room = new ArrayList<>();
        
    }
    
    public void add(Person person) {
        this.room.add(person);
        
    }
    
    public boolean isEmpty() {
        if(this.room.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.room;
    }
    
    public Person shortest() {
        if(this.room.isEmpty()) {
            return null;
        }
        
        Person returnShortest = this.room.get(0);
        
        for(Person prs: this.room) {
            if (returnShortest.getHeight() > prs.getHeight()) {
                returnShortest = prs;
            }
        }
        
        return returnShortest;
    }
    
    public Person take() {
        if (this.room.isEmpty()) {
            return null;
        }
        
        Person shortestPerson = shortest();

        this.room.remove(shortestPerson);

        return shortestPerson;
    }
}
