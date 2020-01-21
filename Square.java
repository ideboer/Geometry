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
        // if      (a.getLL().getY() == b.getLL().getY() && a.getLL().getX() == b.getLL().getX())
        // {
        //     return true;
        // }
        // else if (a.getLL().getY() == b.getUL().getY() && a.getLL().getX() == b.getUL().getX())
        // {
        //     return true;
        // }
        // else if (a.getLL().getY() == b.getUR().getY() && a.getLL().getX() == b.getUR().getX())
        // {
        //     return true;
        // }
        // else if (a.getLL().getY() == b.getLR().getY() && a.getLL().getX() == b.getLR().getX())
        // {
        //     return true;
        // }
        // else if (a.getUL().getY() == b.getUL().getY() && a.getUL().getX() == b.getUL().getX())
        // {
        //     return true;
        // }
        // else if (a.getUL().getY() == b.getUR().getY() && a.getUL().getX() == b.getUR().getX())
        // {
        //     return true;
        // }
        // else if (a.getUL().getY() == b.getLR().getY() && a.getUL().getX() == b.getLR().getX())
        // {
        //     return true;
        // }
        // else if (a.getUR().getY() == b.getUR().getY() && a.getUR().getX() == b.getUR().getX())
        // {
        //     return true;
        // }
        // else if (a.getUR().getY() == b.getLR().getY() && a.getUR().getX() == b.getLR().getX())
        // {
        //     return true;
        // }
        // else if (a.getLR().getY() == b.getLR().getY() && a.getLR().getX() == b.getLR().getX())
        // {
        //     return true;
        // }



        // if (a.getUL().getX() <= b.getUL().getX() && a.getLR().getX() >= b.getUL().getX() && a.getUL().getY() >= b.getUL().getY() && a.getLR().getX() <= b.getUL().getY())
        // {
        //     return true;
        // }
        // if (a.getUL().getX() <= b.getUR().getX() && a.getLR().getX() >= b.getUR().getX() && a.getUL().getY() >= b.getUR().getY() && a.getLR().getX() <= b.getUR().getY())
        // {
        //     return true;
        // }
        // if (a.getUL().getX() <= b.getLR().getX() && a.getLR().getX() >= b.getLR().getX() && a.getUL().getY() >= b.getLR().getY() && a.getLR().getX() <= b.getLR().getY())
        // {
        //     return true;
        // }
        // if (a.getUL().getX() <= b.getLL().getX() && a.getLR().getX() >= b.getLL().getX() && a.getUL().getY() >= b.getLL().getY() && a.getLR().getX() <= b.getLL().getY())
        // {
        //     return true;
        // }

        // return false;




        double[] bXCords = new double[b.getUL().getX(), b.getUR().getX(), b.getLR().getX(), b.getLL().getX()];
        double[] bYCords = new double[b.getUL().getY(), b.getUR().getY(), b.getLR().getY(), b.getLL().getY()];


        for (int i = 0; i < 4; i++)
        {
            if (a.getUL().getX() <= bXCords[i] && a.getLR().getX() >= bXCords[i] && a.getUL().getY() >= bYCords[i] && a.getLR().getX() <= bYCords[i])
            {
                return true;
            }
        }

        return false;
    }

    public boolean isOverlapping(Square b)
    {
        double[] bXCords = new double[b.getUL().getX(), b.getUR().getX(), b.getLR().getX(), b.getLL().getX()];
        double[] bYCords = new double[b.getUL().getY(), b.getUR().getY(), b.getLR().getY(), b.getLL().getY()];


        for (int i = 0; i < 4; i++)
        {
            if (ul.getX() <= bXCords[i] && lr.getX() >= bXCords[i] && ul.getY() >= bYCords[i] && lr.getX() <= bYCords[i])
            {
                return true;
            }
        }

        return false;
    }
}