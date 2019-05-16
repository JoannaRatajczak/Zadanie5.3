public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(5,8);
        Point point2 = new Point (-1, 6);
        Line line1 = new Line(point1, point2);

        Point point3 = new Point(0,8);
        Point point4 = new Point (0, 6);
        Line line2 = new Line(point3, point4);

        Check check = new Check();
        System.out.println(check.distance(line1, line2));


    }
}
