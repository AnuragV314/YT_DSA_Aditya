/**
 * Permutation with spaces | Recursion
 */
public class PermutationWithSpaces {
    static void solve(String ip, String op) {
        if (ip.length() == 0) {
            System.out.print("\"" + op + "\"" + " ");
            return;
        }

        solve(ip.substring(1), op + "_" + ip.charAt(0));
        solve(ip.substring(1), op + ip.charAt(0));

        return;
    }

    public static void main(String[] args) {
        String ip = "ABC";
        String op = " ";
        op = op + ip.charAt(0);
        ip = ip.substring(1);

        // System.out.println(op + " <===> " + ip);

        solve(ip, op);
    }
}
