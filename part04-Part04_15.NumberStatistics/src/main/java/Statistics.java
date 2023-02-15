
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        int numberCount = 0;
        int sum = 0;
        double average = 0;
    }
    
    public void addNumber(int number) {
        sum = number + sum;
        count++;
    }
    
    public int getCount() {
        return count;
    }
    
    public int sum() {
        return sum;
    } 
    
    public double average() {
        if(this.sum != 0 && this.count != 0) {
            return 1.0*this.sum / this.count;
        }
        return 0.0;
    }
}
