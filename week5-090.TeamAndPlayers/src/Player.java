public class Player {

    private String name;
    private int goals;

    public Player(String name){
        this.name = name;
    }

    public Player(String name, int goals){
        this.name = name;
        this.goals = goals;
    }

    public int goals(){
        return goals;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return this.name + ", goals: " + this.goals;
    }
}
