import java.util.Arrays;

/**
 * Print unique subsets
 */
public class UniqueSubsets {

    static void uniqueSubsets(char[] chars, int index, StringBuilder currentSubset) {
        if (index == chars.length) {
            System.out.println(currentSubset.toString());
            return;
        }

        // include
        currentSubset.append(chars[index]);
        uniqueSubsets(chars, index + 1, currentSubset);
        currentSubset.deleteCharAt(currentSubset.length() - 1);

        // skip the duplicate
        while (index < chars.length - 1 && chars[index] == chars[index + 1]) {
            index++;
        }

        // exclude
        uniqueSubsets(chars, index + 1, currentSubset);
    }

    public static void main(String[] args) {
        String str = "abc";
        char[] chars = str.toCharArray();
        // Arrays.sort(chars);
        uniqueSubsets(chars, 0, new StringBuilder());
    }
}