/**
 * Kth Symbol in Grammar
 */

public class KthSymbolInGrammar {
    static int solve(int n, int k) {
        if (n == 1 && k == 1)
            return 0;
        int mid = (int) (Math.pow(2, n - 1) / 2); 

        if (k <= mid) {
            return solve(n - 1, k);
        } else {
            return 1 - solve(n - 1, k - mid); // reverse the number 1 to 0 and 0 to 1(complement)
        }
    }

    public static void main(String[] args) {
        System.out.println(solve(3, 4));
    }
}
