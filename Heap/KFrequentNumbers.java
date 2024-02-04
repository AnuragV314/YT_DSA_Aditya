
/**
 * Top K Frequent Numbers
 */
import java.util.*;

class FrequentNo {
    int n, f;

    public FrequentNo(int n, int f) {
        this.n = n;
        this.f = f;
    }
}

public class KFrequentNumbers {

    static List<Integer> kfrequentNo(int[] arr, int k) {

        int n = arr.length;
        int[] frequency = new int[n + 1];
        for (int num : arr) {
            frequency[num]++;
        }

        PriorityQueue<FrequentNo> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b.f, a.f));

        for (int i = 1; i <= n; i++) {
            if (frequency[i] > 0) {
                maxHeap.offer(new FrequentNo(i, frequency[i]));
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (!maxHeap.isEmpty()) {
                result.add(maxHeap.poll().n);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 3, 2 };
        int k = 2;

        System.out.println(kfrequentNo(arr, k));
    }

}

// using map (chatgpt)

/*
 * import java.util.*;
 * 
 * class NumberFrequency {
 * int number;
 * int frequency;
 * 
 * public NumberFrequency(int number, int frequency) {
 * this.number = number;
 * this.frequency = frequency;
 * }
 * }
 * 
 * public class TopKFrequentNumbers {
 * 
 * public static List<Integer> topKFrequent(int[] nums, int k) {
 * // Step 1: Count the frequency of each number
 * int n = nums.length;
 * int[] frequency = new int[n + 1];
 * for (int num : nums) {
 * frequency[num]++;
 * }
 * 
 * // Step 2: Use a max-heap to keep track of the K most frequent numbers
 * PriorityQueue<NumberFrequency> maxHeap = new PriorityQueue<>((a, b) ->
 * Integer.compare(b.frequency, a.frequency));
 * 
 * // Step 3: Iterate through the frequency array and maintain the max-heap
 * for (int i = 1; i <= n; i++) {
 * if (frequency[i] > 0) {
 * maxHeap.offer(new NumberFrequency(i, frequency[i]));
 * }
 * }
 * 
 * // Step 4: Extract the K most frequent numbers from the max-heap
 * List<Integer> result = new ArrayList<>();
 * for (int i = 0; i < k; i++) {
 * if (!maxHeap.isEmpty()) {
 * result.add(maxHeap.poll().number);
 * }
 * }
 * return result;
 * }
 * 
 * public static void main(String[] args) {
 * int[] nums = {1, 1, 1, 2, 2, 3};
 * int k = 2;
 * List<Integer> result = topKFrequent(nums, k);
 * System.out.println("Top " + k + " frequent numbers: " + result);
 * }
 * }
 * 
 */