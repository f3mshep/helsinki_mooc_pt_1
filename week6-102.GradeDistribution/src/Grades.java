import java.util.ArrayList;

public class Grades {

    private ArrayList<Grade> grades = new ArrayList<Grade>();

    public Grades() {

    }

    public void addGrade(int score){
        Grade grade = new Grade(score);
        grades.add(grade);
    }

    public void printDistribution(){
        int[] distribution = getDistribution();
        for (int i = distribution.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            printStars(distribution[i]);
        }
    }

    public double acceptancePercentage(){
        return (double) 100 * numberAccepted() / grades.size();
    }

    private int numberAccepted(){

        int count = 0;

        for (Grade grade : grades){
            if (grade.isAccepted()) count++;
        }

        return count;
    }

    private void printStars(int num){
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private int[] getDistribution(){
        int[] distribution = new int[6];
        for ( Grade grade : grades ) {
            int j = grade.getScore();
            distribution[j]++;
        }
        return distribution;
    }
}
