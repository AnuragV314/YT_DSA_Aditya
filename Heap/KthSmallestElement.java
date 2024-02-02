
/**
 * Kth Smallest Element
*/

import java.util.PriorityQueue;

public class KthSmallestElement {
    static int findKthSmallest(int[] arr, int k) {
        // create a min-heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i : arr) {
            minHeap.offer(i);
        }
        // System.out.println(minHeap);

        // extract kth smallest element
        for (int i = 0; i < k - 1; i++) {
            minHeap.poll();
        }

        return minHeap.poll();
    }

    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 20, 15 };
        int k = 3;
        System.out.println(findKthSmallest(arr, k));
    }
}




// find the kth largest element


/*
         for(int i= 0;i<arr.length;i++){
            maxHeap.offer(arr[i]);

            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        return maxHeap.poll();
         */
