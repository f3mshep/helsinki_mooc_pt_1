import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> people = new ArrayList<Person>();

    public Phonebook(){

    }

    public void printAll(){
        for (Person person:people){
            System.out.println(person);
        }
    }


    public void add(String name, String number ){
        Person person = new Person(name, number);
        this.people.add(person);
    }

    public String searchNumber(String name){
        for (Person person : people){
            if (person.getName().equals(name)){
                return person.getNumber();
            }
        }
        return "number not known";
    }

}
