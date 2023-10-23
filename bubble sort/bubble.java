import java.util.Arrays;
public class bubble{
    public static void main(String args[]){
        int arr[] = {10,3,2,1,23,44,5};
        bubbleSort(arr);
    }

public static void bubbleSort(int[] a) {
    boolean sorted = false;
    int temp;
    while(!sorted) {
        sorted = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i+1]) {
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                sorted = false;
            }
        }
    }
    System.out.print(Arrays.toString(a));
}}