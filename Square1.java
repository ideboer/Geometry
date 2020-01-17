class Square
{
    double length = 0;
    Point lowerLeftPoint;

    public Square(double length, Point lowerLeftPoint)
    {
        this.length = length;
        this.Point = lowerLeftPoint;
    }

    public double getArea()
    {
        return this.length * this.length;
    }

    public double getPerimeter()
    {
        return this.length * 4;
    }
}