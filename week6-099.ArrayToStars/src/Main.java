
public class Main {


    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        String[] stars = {"","*", "**", "***", "****", "*****", "******", "*******", "********", "*********"};

        for (int num : array){
            System.out.println(stars[num]);
        }
    }
}
