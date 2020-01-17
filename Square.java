import java.util.*;

class Square {
    Point a;
    Point b;
    Point c;
    Point d;
    double length;

    public Square(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        length = a.distance(b);
    }

    public double area() {
        return length * length;
    }

    public double perimeter() {
        return length * 4;
    }
}