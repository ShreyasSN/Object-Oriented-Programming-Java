import java.util.*;

class Point {
    private double abscissa;
    private double ordinate;

    public Point(double abscissa, double ordinate) {
        this.abscissa = abscissa;
        this.ordinate = ordinate;
    }

    public static Point midPoint(Point point1, Point point2) {
        double midX = (point1.abscissa + point2.abscissa) / 2;
        double midY = (point1.ordinate + point2.ordinate) / 2;
        return new Point(midX, midY);
    }

    @Override
    public String toString() {
        return String.format("%.2f,%.2f", abscissa, ordinate);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        String[] point1Coords = scanner.nextLine().split(",");
        String[] point2Coords = scanner.nextLine().split(",");
        if (point1Coords.length != 2 || point2Coords.length != 2) {
            System.out.println("INVALID");
            scanner.close();
            return;
        }

        double x1 = Double.parseDouble(point1Coords[0]);
        double y1 = Double.parseDouble(point1Coords[1]);
        double x2 = Double.parseDouble(point2Coords[0]);
        double y2 = Double.parseDouble(point2Coords[1]);

        // Create Point objects
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);

        // Calculate and print the midpoint
        Point midPoint = Point.midPoint(point1, point2);
        System.out.println(midPoint);
        scanner.close();
    }
}
