
/**
 * Kth Largest Element
 */

import java.util.PriorityQueue;

public class KthLargestElement {
    static int findKthLargest(int[] arr, int k) {
        // create a max-heap with a custom comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        // add elements to the heap
        for (int i : arr) {
            maxHeap.offer(i);
        }

        for (int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }

        return maxHeap.poll();


        
    }

    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 20, 15 };
        int k = 3;
        System.out.println(findKthLargest(arr, k));
    }
}
