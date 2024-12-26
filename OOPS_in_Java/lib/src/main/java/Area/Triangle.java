package Area;

public class Triangle implements Shape{
    private double base;
    private double height;
    //Constructor using alt+insert:
    public Triangle(double base,double height) {
        this.base = base;
        this.height = height;
    }
    public double calArea(){
        return (base*height)/2;
    }

    @Override
    public double calPerimeter() {
        return 0;
    }
    //We did not define calPerimeter for triangle class here:
}
