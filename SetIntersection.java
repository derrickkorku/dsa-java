import java.util.HashSet;

/**
 * Question 1
 * 
 * Intersection of two sets. Given two arrays a[]a[] and b[]b[], each containing
 * nn distinct 2D points in the plane, design a subquadratic algorithm to count
 * the number of points that are contained both in array a[]a[] and array
 * b[]b[].
 */
public class SetIntersection {

    public static int intersectionCount(Point[] a, Point[] b) {
        int count = 0;

        HashSet<Point> points = new HashSet<Point>();

        for (Point p : a) {
            points.add(p);
        }

        for (Point pb : b) {
            if (points.contains(pb)) {
                count++;
            }
        }

        return count;
    }

    private class Point {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Point)) {
                return false;
            }

            Point other = (Point) obj;

            return this.x == other.x && this.y == other.y;
        }

        public int hashCode() {
            return x * 31 + y;
        }
    }

}
