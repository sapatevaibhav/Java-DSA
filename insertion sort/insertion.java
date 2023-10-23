import java.util.Arrays;
public class insertion{
    public static void main(String args[]){
        int arr[] = {10,3,2,1,23,44,5433,434,3424,555,2222424,44};
        insertionSort(arr);
    }

public static void insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
        int current = array[i];
        int j = i - 1;
        while(j >= 0 && current < array[j]) {
            array[j+1] = array[j];
            j--;
        }
        // at this point we've exited, so j is either -1
        // or it's at the first element where current >= a[j]
        array[j+1] = current;
    }
    System.out.print(Arrays.toString(array));
}}