
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        
        int[] numbears = {3, -5, 6, 1, 7, 1, -16, 7, 5};
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbears));
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0;i < array.length; i++) {
            if(smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 0;i < array.length; i++) {
            if(smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;        
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexOfSmallest = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if(array[indexOfSmallest] > array[i]) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int i1 = index1;
        int i2 = index2;
        int swap = 0;
        
        swap = array[i2];
        array[i2] = array[i1];
        array[i1] = swap;       
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }     
    }
}
