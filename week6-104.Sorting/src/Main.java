import java.util.Arrays;

public class Main {

    public static int smallest(int[] array){
        int smallest = array[0];
        for (int num : array){
            if (num < smallest) smallest = num;
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int [] array){
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int [] array, int index){
        int smallest = array[index];
        int smallestIndex = index;
        for (int i = index; i < array.length; i++) {
           if (array[i] < smallest) {
               smallest = array[i];
               smallestIndex = i;
           }

        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2){
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
        System.out.println(Arrays.toString(array) );
    }

    public static void sort(int[] array){
        int j;
        for (int i = 0; i < array.length; i++) {
            j = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, j);
        }
    }

    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

}
