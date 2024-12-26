package Area;

public class MyClass {
    public static void main(String [] args){
        Circle c1=new Circle(5);
        Rectangle r1=new Rectangle(4,6);
        System.out.println("Area of circle "+c1.calArea());
        System.out.println("Perimeter of circle "+c1.calPerimeter());
        System.out.println("Area of rectangle "+r1.calArea());
        System.out.println("Perimeter of rectangle "+r1.calPerimeter());
    }

}
