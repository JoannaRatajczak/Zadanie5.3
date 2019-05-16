public class Check {

    Line distance (Line line1, Line line2){
        double line1lenght =lenght(line1);
        double line2lenght =lenght(line2);
        if (line1lenght>line2lenght)
            return line1;
        else return line2;

    }

    private double sqr(double a) {
        return a*a;
    }

    double lenght (Line line){
        double odc;
        odc = (sqr(line.point1.a-line.point1.b)+sqr(line.point2.a-line.point2.b))*(0.5);
        return odc;
    }

}
