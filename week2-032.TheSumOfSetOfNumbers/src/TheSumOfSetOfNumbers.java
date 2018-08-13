
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("Until what?");
        Integer limit = Integer.parseInt(reader.nextLine());
        Integer i = 1;
        Integer sum = 0;
        while(i <= limit){
            sum += i;
            i++;
        }
        System.out.println("Sum is "+ sum);
    }
}
