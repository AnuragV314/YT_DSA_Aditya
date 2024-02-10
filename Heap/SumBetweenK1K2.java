
/**
 * Sum of Elements between k1 smallest and k2 smallest numbers
 */

import java.util.PriorityQueue;

public class SumBetweenK1K2 {
    static int sumBetweenK1K2(int[] arr, int k1, int k2) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num);
        }

        for (int i = 0; i < k1; i++) {
            minHeap.poll();
        }

        int sum = 0;
        for (int i = 0; i < k2-k1-1; i++) {
            sum += minHeap.poll();
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 20, 8, 22, 4, 12, 10, 14 };
        int k1 = 3;
        int k2 = 6;

        int result = sumBetweenK1K2(arr, k1, k2);
        System.out.println("Sum of elements between " + k1 + "th and " + k2 + "th smallest numbers: " + result);

    }
}
/*
 * Example :
 * Input : arr[] = {20, 8, 22, 4, 12, 10, 14}, k1 = 3, k2 = 6
 * Output : 26
 * 3rd smallest element is 10. 6th smallest element
 * is 20. Sum of all element between k1 & k2 is
 * 12 + 14 = 26 .
 */