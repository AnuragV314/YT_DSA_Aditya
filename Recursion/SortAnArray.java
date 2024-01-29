import java.util.ArrayList;

public class SortAnArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(1);
        arrayList.add(5);

        sort(arrayList);

        System.out.println("Sorted Array: " + arrayList);
    }

    static void sort(ArrayList<Integer> arr) {
        if (arr.size() <= 1)
            return;

        int temp = arr.remove(arr.size() - 1);
        sort(arr);
        insert(arr, temp);
    }

    static void insert(ArrayList<Integer> arr, int element) {
        if (arr.isEmpty() || arr.get(arr.size() - 1) <= element) {
            arr.add(element);
            return;
        }

        int temp = arr.remove(arr.size() - 1);
        insert(arr, element);
        arr.add(temp);
    }
}
