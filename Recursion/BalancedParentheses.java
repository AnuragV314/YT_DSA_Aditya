/**
 * Generate all Balanced Parentheses
 */
public class BalancedParentheses {

    static void solve(int open, int close, String op) {
        if (open == 0 && close == 0) {
            System.out.println(op + " ");
        }

        // if(open != 0){
        //     String op1 = op;
        //     op1 = op1+"(";
        //     solve(open-1, close, op1);
        // }

        // if(close > open){
        //     String op2 = op;
        //     op2 = op2+")";
        //     solve(open, close-1, op2);
        // }

        // or 
        if (open != 0) {
            solve(open-1, close, op+"(");
        }
        if(close > open){
            solve(open, close-1, op+")");
        }
    }

    public static void main(String[] args) {
        int open = 3, close = 3;
        String op = " ";

        solve(open, close, op);
    }
}
