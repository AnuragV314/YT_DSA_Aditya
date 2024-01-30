/**
 * Print Subsets | Print PowerSets | Print all Subsequences
 */
public class PrintSubsets {
    static void solve(String ip, String op) {
        if (ip.length() == 0) {
            System.out.print("\"" + op + "\"" + " ");
            return;
        }

        // excluding the first character from the input string
        solve(ip.substring(1), op);
        // include the first character in the subset
        solve(ip.substring(1), op + ip.charAt(0));

        return;
    }

    public static void main(String[] args) {
        String ip = "abc";
        String op = " ";
        solve(ip, op);
    }
}
