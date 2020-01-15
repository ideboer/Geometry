import java.util.*;

class Polygon
{
    ArrayList<Point> points = new ArrayList<Point>();

    public Polygon(ArrayList<Point> points)
    {
        this.points = points;
    }

    public double perimeter()
    {
        double perimeter = 0;

        for (int i = 0; i < points.size() - 1; i++)
        {
            perimeter += points.get(i).distance(points.get(i + 1));
        }

        perimeter += points.get(points.size()).distance(points.get(0));

        return perimeter;
    }
}