class Shape{
    void draw(){
        System.out.println("This is the draw method");
    }
    int calculatArea(){
        return 0;
    }
}
class CircleShape extends Shape{
    double radius;
    CircleShape(double radius){
        this.radius = radius;
    }
    void draw(){
        System.out.println("Drawing the area for the circle -->" + radius);
    }
    void calculateArea(){
        System.out.println("Area of Circle: " + 3.14*radius*radius);
    }
}
class CylinderShape extends Shape{
    double radius;
    double height;
    CylinderShape(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    void draw(){
        System.out.println("Drawing the area for the circle -->" + radius + ", " + height);
    }
    void calculateArea(){
        System.out.println("Area of Circle: " + 3.14*radius*radius*height);
    }
}
public class ShapeClass {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        CircleShape ca1 = new CircleShape(5.0);
        ca1.calculateArea();
    }
}
