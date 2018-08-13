public class Clock {
    private BoundedCounter hours = new BoundedCounter(23);
    private BoundedCounter minutes = new BoundedCounter(59);
    private BoundedCounter seconds = new BoundedCounter(59);
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
        // Clock advances by one second
        this.seconds.next();
        if (getSeconds() == 0){
            this.minutes.next();
        }
        if (getSeconds() == 0 && getMinutes() == 0){
            this.hours.next();
        }
    }
    
    public String toString() {
        // returns the string representation
        return hours.toString() +":" + minutes.toString() + ":" + seconds.toString();
    }

    private int getSeconds(){
        return seconds.getValue();
    }

    private int getMinutes(){
        return minutes.getValue();
    }

    private int getHours(){
        return hours.getValue();
    }
}
