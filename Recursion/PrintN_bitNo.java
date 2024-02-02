
/**
 * Print N-bit binary numbers having more 1’s than 0’s for any prefix
 */

import java.util.Scanner;

public class PrintN_bitNo {

    static void solve(int ones, int zeros, int n, String op) {
        if (n == 0) {
            System.out.println(op);
            return;
        }

        String op1 = op;
        op1 = op1 + "1";
        solve(ones + 1, zeros, n - 1, op1);

        if (ones > zeros) {
            String op2 = op;
            op2 = op2 + "0";
            solve(ones, zeros + 1, n - 1, op2);
        }

        // or
        /* 
        solve(ones + 1, zeros, n - 1, op + "1");
        if (ones > zeros) {
            solve(ones, zeros + 1, n - 1, op + "0");
        }
        */
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number for N: ");

        int n = obj.nextInt();

        int ones = 0, zeros = 0;
        String op = " ";

        solve(ones, zeros, n, op);

    }
}
