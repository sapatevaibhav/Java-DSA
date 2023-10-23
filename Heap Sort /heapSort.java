import java.util.*;
 
public class heapSort {
    
    // This is code for Heap Sort 
    public static void heapSort(int[] arr)
    {
        PriorityQueue<Integer> maxHeap
            = new PriorityQueue<>(
                Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            maxHeap.offer(arr[i]);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = maxHeap.poll();
        }
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 60, 20, 40, 70, 30, 10 };
        System.out.println("Before Sorting: "
                           + Arrays.toString(arr));
        heapSort(arr);
        System.out.println("After Sorting: "
                           + Arrays.toString(arr));
    }
}