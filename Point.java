import java.util.*;

public class Point {

    private double x, y;

    public Point(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point p) {

        double distance;

        distance = Math.sqrt( ( (p.getX() - x) * (p.getX() - x) ) + ( (p.getY() - y) * (p.getY() - y) ) );

        return distance;
    }
}