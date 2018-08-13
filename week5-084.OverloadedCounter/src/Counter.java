public class Counter {

    private int value;
    private boolean check;

    public Counter(int startingValue, boolean check){
        this.value = startingValue;
        this.check = check;
    }

    public Counter(int startingValue){
        this.value = startingValue;
    }

    public Counter(boolean check){
        this.check = check;
    }

    public Counter(){

    }

    public int value(){
        return this.value;
    }

    public void increase(){
        value++;
    }

    public void decrease(){
        if (check){
            if (value - 1 >= 0) value--;
        } else {
            value--;
        }

    }

    public void increase(int amount){
        if (isNegative(amount)) return;
        value += amount;
    }

    public void decrease(int amount){
        if (isNegative(amount)) return;
        if (check){
            if (value - amount >= 0) {
                value -= amount;
            } else {
                value = 0;
            }
        } else {
            value -= amount;
        }

    }

    private boolean isNegative(int n){
        return n < 0;
    }

}
