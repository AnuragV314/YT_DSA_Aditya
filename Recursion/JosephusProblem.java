/*
 * Josephus Problem | Game of Death in a circle | Execution in Circle
*/

public class JosephusProblem {
    static int solve(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            // calculating the position of the survivor in a smaller circle
            return (solve(n - 1, k)+ k-1) % n + 1;
            // return (index + k-1) % n+1
        }

    }

    public static void main(String[] args) {
        int n = 40, k = 7;
        int survivor = solve(n, k);
        System.out.println("The survivor is person number: " + survivor);

    }
}

// without recursion ()

/*
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 * public class JosephusProblem {
 * 
 * public static int josephus(int n, int k) {
 * List<Integer> people = new ArrayList<>();
 * 
 * // Populate the list with people numbered from 1 to n
 * for (int i = 1; i <= n; i++) {
 * people.add(i);
 * }
 * 
 * int index = 0;
 * while (people.size() > 1) {
 * // Find the person to be eliminated
 * index = (index + k - 1) % people.size();
 * 
 * // Remove the eliminated person
 * people.remove(index);
 * }
 * 
 * // Return the surviving person
 * return people.get(0);
 * }
 * 
 * public static void main(String[] args) {
 * int n = 7; // Number of people
 * int k = 3; // Every k-th person is eliminated
 * 
 * int survivor = josephus(n, k);
 * System.out.println("The survivor is person number: " + survivor);
 * }
 * }
 * 
 */