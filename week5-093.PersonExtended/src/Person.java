

import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person(String name){
        this.name = name;
        this.birthday = getToday();
    }

    public Person(String name, MyDate date){
        this.name = name;
        this.birthday = date;
    }

    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows:
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);
        MyDate current = getToday();
        return current.differenceInYears(birthday);
    }

    public boolean olderThan(Person other){
        return this.birthday.earlier(other.birthday);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name +", born "+ this.birthday;
    }

    private static MyDate getToday(){
        return new MyDate(
                Calendar.getInstance().get(Calendar.DATE),
                Calendar.getInstance().get(Calendar.MONTH) + 1,
                Calendar.getInstance().get(Calendar.YEAR)
        );
    }
}
  