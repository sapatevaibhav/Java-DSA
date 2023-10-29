import java.util.Arrays;
public class selectionSort{
    public static void main(String args[]){
        int arr[] = {10,3,2,1,23,44,5433,434,3424,555,2222424,44};
        selectionSorting(arr);
    }

public static void selectionSorting(int[] array) {
    for (int i = 0; i < array.length; i++) {
        int min = array[i];
        int minId = i;
        for (int j = i+1; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                minId = j;
            }
        }
        
        int temp = array[i];
        array[i] = min;
        array[minId] = temp;
    }
    System.out.print( Arrays.toString(array));
}}