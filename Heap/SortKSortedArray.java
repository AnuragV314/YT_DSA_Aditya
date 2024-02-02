import java.util.PriorityQueue;

/**
 * Sort a K Sorted Array | Sort Nearly Sorted Array
 */

public class SortKSortedArray {

    static int[] sortKSorted(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i <= k && i < arr.length; i++) {
            minHeap.offer(arr[i]);
        }

        int index = 0;
        for (int i = k+1; i < arr.length; i++) {
            arr[index++] = minHeap.poll();
            minHeap.offer(arr[i]);
        }

        while (!minHeap.isEmpty()) {
            arr[index++] = minHeap.poll();
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 5, 3, 2, 8, 10, 9 };
        int k = 3;
        int[] sortedArray = sortKSorted(arr, k);

        System.out.println("Sorted K Sorted Array:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
