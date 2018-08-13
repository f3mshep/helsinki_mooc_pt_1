import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int num = Integer.parseInt(reader.nextLine());
        int product = 1;
        int i = 1;
        while (i <= num){
            product *= i;
            i++;
        }
        System.out.println("Factorial is " + product);
    }
}
