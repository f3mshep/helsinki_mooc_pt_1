
public class BoundedCounter {

    private int value;

    private int upperLimit;



    public BoundedCounter(int upperLimit) {

        this.value = 0;

        this.upperLimit = upperLimit;

    }



    public void next() {

        // write code here

        value += 1;

        if (value > upperLimit) value = 0;

    }



    public String toString() {

        // write code here

        String val = "" + value;

        if (val.length() < 2)  val = "0" + value;

        return val;

    }



    public void setValue(int n){

        if (n > 0 && n <= upperLimit) this.value = n;

    }



    public int getValue(){

        return value;

    }

}