
class Shape {
    void getPerimeter(){
        System.out.println("What is the perimeter?");
    }
    void getArea(){
        System.out.println("What is the area?");
    }
}
class Circle extends Shape{
    double radius;
    Circle(double r){
        radius = r;
    }
    void getPerimeter(){
        System.out.println("Perimeter -->" + radius*2*3.14);
    }
    void getArea(){
        System.out.println("Area --> " + radius*radius*3.14);
    }
}
public class AA{
    public static void main(String[] args) {
        Circle c1 = new Circle(9.0);
        c1.getPerimeter();
        c1.getArea();  
    }
}

