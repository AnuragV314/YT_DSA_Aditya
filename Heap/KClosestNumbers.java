/**
 * K Closest Numbers
 */

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


public class KClosestNumbers {
    static class Pair implements Comparable<Pair> {
        int num;
        int diff;

        public Pair(int num, int diff) {
            this.num = num;
            this.diff = diff;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.num, other.diff);
        }
    }

    static List<Integer> kClosestNo(int[] arr, int target, int k) {
        PriorityQueue<Pair> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            int diff = Math.abs(num - target);
            minHeap.offer(new Pair(num, diff));
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            result.add(minHeap.poll().num);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 2, 14, 4, 7, 6 };
        int x = 5, k = 3;

        List<Integer> closestNo = kClosestNo(arr, x, k);
        System.out.println(closestNo);
    }

}