/**
 * Permutation with Case Change | Recursion
 */

public class PermutationwithCaseChange {

    static void solve(String ip, String op) {
        if (ip.length() == 0) {
            System.out.println(op);
            return;
        }

        solve(ip.substring(1), op + ip.charAt(0));
        solve(ip.substring(1), op.toUpperCase() + ip.charAt(0));
    }

    public static void main(String[] args) {
        String ip = "ab";
        String op = " ";

        solve(ip, op);
    }
}
