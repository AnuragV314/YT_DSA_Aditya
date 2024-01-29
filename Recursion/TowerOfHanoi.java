public class TowerOfHanoi {

    static void solve(int n, int source, int helper, int destination) {
        if (n == 1) {
            System.out.println("Moving plate " + n + " from " + source + " to " + destination);
        } else {
            solve(n - 1, source, destination, helper);
            System.out.println("Moving plate " + n + " from " + source + " to " + destination);
            solve(n - 1, helper, source, destination);
        }
    }

    public static void main(String[] args) {
        int numberOfPlates = 3;
        int sourceRod = 1;
        int helperRod = 2;
        int destinationRod = 3;

        solve(numberOfPlates, sourceRod, helperRod, destinationRod);
    }
}
