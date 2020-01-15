public class GeometryTester {

    public static void main(String[] main) {
        Point point0 = new Point(5.0, 6.0);
        Point point1 = new Point(2.0, 3.0);
        Point point2 = new Point(5.0, 3.0);

        Triangle triangle0 = new Triangle(point0, point1, point2);

        System.out.println("point 0 x: " + point0.getX());
        System.out.println("point 0 y: " + point0.getY());
        System.out.println("point 1 x: " + point1.getX());
        System.out.println("point 1 y: " + point1.getY());
        System.out.println("point 2 x: "  + point2.getX());
        System.out.println("point 2 y: " + point2.getY());
        System.out.println("triangle 0 area: " + triangle0.area());
    }
}