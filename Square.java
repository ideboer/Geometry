import java.util.*;

class Square {
    private Point ll;
    private Point ul;
    private Point lr;
    private Point ur;
    private double length;

    public Square(Point ll, double length) {
        this.ll = ll;
        this.length = length;
        ul = new Point(ll.getX(), ll.getY() + length);
        lr = new Point(ll.getX() + length, ll.getY());
        ur = new Point(ll.getX() + length, ll.getY() + length);
    }

    public double area() {
        return length * length;
    }

    public double perimeter() {
        return length * 4;
    }

    public Point getLL()
    {
        return ll;
    }
    public Point getUL()
    {
        return ul;
    }
    public Point getLR()
    {
        return lr;
    }
    public Point getUR()
    {
        return ur;
    }


    public static boolean isOverlapping(Square a, Square b) {
        if (a.getLL().getY() == b.getLL().getY() && a.getLL().getX() == b.getLL().getX())
        {
            return true;
        }
        else if (a.getLL().getY() == b.getUL().getY() && a.getLL().getX() == b.getUL().getX())
        {
            return true;
        }
        else if (a.getLL().getY() == b.getUR().getY() && a.getLL().getX() == b.getUR().getX())
        {
            return true;
        }
        else if (a.getLL().getY() == b.getLR().getY() && a.getLL().getX() == b.getLR().getX())
        {
            return true;
        }

        
        else if (a.getLL().getY() == b.getLL().getY() && a.getLL().getX() == b.getLL().getX())
        {
            return true;
        }
        else if (a.getLL().getY() == b.getLL().getY() && a.getLL().getX() == b.getLL().getX())
        {
            return true;
        }
        else if (a.getLL().getY() == b.getLL().getY() && a.getLL().getX() == b.getLL().getX())
        {
            return true;
        }
        else if (a.getLL().getY() == b.getLL().getY() && a.getLL().getX() == b.getLL().getX())
        {
            return true;
        }
        else if (a.getLL().getY() == b.getLL().getY() && a.getLL().getX() == b.getLL().getX())
        {
            return true;
        }
        else if (a.getLL().getY() == b.getLL().getY() && a.getLL().getX() == b.getLL().getX())
        {
            return true;
        }
    }
}