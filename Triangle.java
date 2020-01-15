import java.util.*;

class Triange
{
    Point a;
    Point b;
    Point c;

    public Trangle(Point a, Point b, Point c)
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
        double aDist = a.distance();
        double bDist = b.distance();
        double cDist = c.distance();

        angleC = Math.acos(((cDist * cDist) - (aDist * aDist) - (bDist * bDist)) / ( -2 * aDist * bDist)); // law of cosines

        area = 0.5 * aDist * bDist * Math.sin(angleC);

        return area;
    }
}