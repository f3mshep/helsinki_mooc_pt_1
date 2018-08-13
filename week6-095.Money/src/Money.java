
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }
        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money added){
        int newCents = this.cents + added.cents;
        int newEuros = this.euros + added.euros;
        if (newCents > 99) {
            newEuros += newCents / 100;
            newCents %= 100;
        }
        return new Money(newEuros, newCents);
    }

    public boolean less(Money compared){
        return this.toCents() < compared.toCents();
    }

    public Money minus(Money removed){
        if (this.less(removed)) return new Money(0,0);
        int newCents = this.cents - removed.cents;
        int newEuros = this.euros - removed.euros;
        if (newCents < 0) {
            newEuros--;
            newCents = 100 - Math.abs(newCents);
        }
        return new Money(newEuros, newCents);
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    private int toCents(){
        return (this.euros * 100) + this.cents;
    }

}
