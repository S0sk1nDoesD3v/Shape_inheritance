import java.lang.Math;

public class Circle2D extends Shape2D {
    private double radius;

    public Circle2D(double radius){
        this.radius= radius;
    }

    @Override
    public double get2DArea() {
        area = radius * radius * Math.PI;
        return Math.round((area *100)/100);
    }
}



