/**
 * K Closest Points To Origin
*/

import java.util.PriorityQueue;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getDis() {
        return x * x + y * y;
    }
    
}

public class KClosestPoints {

    static int[][] kClosest(int[][] pt, int k){
        PriorityQueue<Point> heap = new PriorityQueue<>((a, b) -> a.getDis()-b.getDis());


        for(int[] point: pt){
            heap.offer(new Point(point[0], point[1]));

            if(heap.size()>k){
                heap.poll();
            }
        }
        int[][] result = new int[k][2];

       for (int i = k - 1; i >= 0; i--) {
            Point point = heap.poll();
            result[i][0] = point.x;
            result[i][1] = point.y;
        }

        return result;

        
    }

    public static void main(String[] args) {
        int[][] pt = { { 3, 3 }, { -2, 4 }, { 5, -1 } };
        int k = 2;

        int[][] closestPoints = kClosest(pt, k);

        System.out.println("K closest points to origin:");
        for (int[] point : closestPoints) {
            System.out.println("(" + point[0] + ", " + point[1] + ")");
        }
    }
}
