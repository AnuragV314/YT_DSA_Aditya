
/**
 * Frequency Sort
 */

import java.util.*;

public class FrequencySort {
    static List<Integer> sortedList(int[] arr) {

        Map<Integer, Integer> fm = new HashMap<>();
        for (int num : arr) {
            fm.put(num, fm.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> b.getValue() != a.getValue() ? b.getValue() - a.getValue() : a.getKey() - b.getKey());

        maxHeap.addAll(fm.entrySet());

        List<Integer> result = new ArrayList<>();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            int number = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                result.add(number);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 4, 3 };
        System.out.println(sortedList(arr));
    }
}