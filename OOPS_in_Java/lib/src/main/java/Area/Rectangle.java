package Area;

public class Rectangle  implements Shape{
    private double length;
    private double breadth;
    //Constructor using alt+insert:
    public Rectangle(double length,double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double calArea(){
        return length*breadth;
    }
    public double calPerimeter(){
        return 2*(length+breadth);
    }
}
