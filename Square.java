import java.util.*;

class Square {
    Point ll;
    Point ul;
    Point lr;
    Point up;
    double length;

    public Square(Point ll, double length) {
        this.ll = ll;
        this.length = length;
        ul = new Point(a.getX(), a.getY() + length);
        lr = new Point(a.getX() + length;, a.getY());
        ul = new Point(a.getX() + length, a.getY() + length);
    }

    public double area() {
        return length * length;
    }

    public double perimeter() {
        return length * 4;
    }
}