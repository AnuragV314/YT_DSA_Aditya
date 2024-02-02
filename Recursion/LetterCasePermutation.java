/**
 * Letter Case Permutation | Recursion
 */
public class LetterCasePermutation {
    static void solve(String ip, String op) {
        if (ip.length() == 0) {
            System.out.print(op + " ");
            return;
        }
        if (Character.isAlphabetic(ip.charAt(0))) {
            
            solve(ip.substring(1), op.toLowerCase() + ip.charAt(0));
            
            solve(ip.substring(1), op.toUpperCase() + ip.charAt(0));
        }
        else{
            solve(ip.substring(1), op+ip.charAt(0));
        }
    }

    public static void main(String[] args) {
        String ip = "a1b2";
        String op = " ";
        solve(ip, op);
    }

}
