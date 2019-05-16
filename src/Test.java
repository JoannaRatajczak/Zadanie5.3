public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(5,80);
        Point point2 = new Point (-5, 50);
        Line line1 = new Line(point1, point2);

        Point point3 = new Point(0,8);
        Point point4 = new Point (0, 6);
        Line line2 = new Line(point3, point4);

        Check check = new Check();
        Line longerOne = check.distance(line1, line2);
        System.out.println("Początek: "+longerOne.point1.a +", "+ longerOne.point1.b + " ;koniec: "+longerOne.point2.a +", "+ longerOne.point2.b+" Długość: "+check.lenght(longerOne));


    }
}
