import java.util.*;

class Triangle
{
    Point a;
    Point b;
    Point c;

    public Triangle(Point a, Point b, Point c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area()
    {
        // Area = .5 * a * b * sinC
        double angleC;
        double area;
        double aDist = b.distance(c);
        double bDist = a.distance(c);
        double cDist = a.distance(b);

        angleC = Math.acos(((cDist * cDist) - (aDist * aDist) - (bDist * bDist)) / ( -2 * aDist * bDist)); // law of cosines

        area = 0.5 * aDist * bDist * Math.sin(angleC);

        return area;
    }
}