import java.util.*;

class Square {
    Point a;
    Point b;
    Point c;
    Point d;
    double length;
    double width;

    public Square(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        length = a.distance(b);
        width = b.distance(c);
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return (length * 2) + (width * 2);
    }
}