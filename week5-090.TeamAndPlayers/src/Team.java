import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize = 16;

    public Team(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player){
        if (size() >= maxSize) return;
        players.add(player);
    }

    public void printPlayers(){
        for (Player player : players){
            System.out.println(player.toString());
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size(){
        int count = 0;
        for (Player player:players){
            count++;
        }
        return count;
    }

    public int goals(){
        int goals = 0;
        for (Player player : players){
            goals += player.goals();
        }
        return goals;
    }
}
