public class Fitbyte {
    private int age;
    private double restingHeartRate;
    
    
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
        
    }
    
    public double targetHeartRate(double percentOfMaximum) {
        //(maximum heart rate - resting heart rate) * (target heart rate percentage) + resting heart rate
        //double maxHeartRate = (206.3 - (0.711 * this.age);
        //return (maxHeartRate - this.restingHeartRate) * percentOfMaximum + this.restingHeartRate; 
        return (206.3 - (0.711 * this.age) - this.restingHeartRate) * percentOfMaximum + this.restingHeartRate;     
    }
}
