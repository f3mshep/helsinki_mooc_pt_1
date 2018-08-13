public class Person {

    private String name, number;

    public Person(String name, String phoneNumber){
        this.name = name;
        this.number = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void changeNumber(String number) {
        this.number = number;
    }

    public String toString(){
        return this.name + " number: " + this.number;
    }
}
