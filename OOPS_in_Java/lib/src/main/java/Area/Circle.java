package Area;

public class Circle implements Shape{
    private double radius;
    //Constructor using alt+insert:
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calArea(){
        return 3.14*radius*radius;
    }
    public double calPerimeter(){
        return 2*3.14*radius;
    }
}
