
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Write your code here
        System.out.println("Up to what number?");
        Integer limit = Integer.parseInt(reader.nextLine());
        Integer num = 1;
        while (num <= limit){
            System.out.println(num);
            num++;
        }
    }
}
