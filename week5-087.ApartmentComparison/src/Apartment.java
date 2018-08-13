
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment){
        return this.squareMeters > otherApartment.squareMeters;
    }

    public int priceDifference(Apartment otherApartment){
        int myPrice = getPrice(this);
        int otherPrice = getPrice(otherApartment);
        return Math.abs(myPrice - otherPrice);
    }

    public boolean moreExpensiveThan(Apartment other){
        int myPrice = getPrice(this);
        int otherPrice = getPrice(other);
        return myPrice > otherPrice;
    }

    private int getPrice(Apartment apartment){
        return apartment.pricePerSquareMeter * apartment.squareMeters;
    }
    
}
