
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First:");
        Integer start = Integer.parseInt(reader.nextLine());
        System.out.println("Last:");
        Integer limit = Integer.parseInt(reader.nextLine());
        Integer i = start;
        Integer sum = 0;
        while(i <= limit){
            System.out.println(i);
            i++;
        }
    }
}
