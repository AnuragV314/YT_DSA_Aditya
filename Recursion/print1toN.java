/**
 * print1toN
 */
public class print1toN {

    static void pOneToN(int N) {
        if (N == 1)
            System.out.println(1);
        else {
            System.out.println(N);
            pOneToN(N - 1);
        }
    }

    public static void main(String[] args) {
        pOneToN(10);
    }

}
