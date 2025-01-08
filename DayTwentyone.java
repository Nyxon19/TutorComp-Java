abstract class Shape34{
    public abstract void calculateArea();

    public abstract void calculatePerimeter();
}
class Triangle34 extends Shape34{
    private int side1,side2,side3;
    Triangle34(int side1, int side2,int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public void calculateArea(){
        double s = (side1+side2+side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println(area + " is the area.");
    }
    public void calculatePerimeter(){
        System.out.println(side1+side2+side3 + " is the perimter.");
    }
}
class Circle34 extends Shape34{
    private int radius;
    Circle34(int radius){
        this.radius = radius;
    }
    public void calculateArea(){
        double area = radius*radius*3.14;
        System.out.println(area + " is the area of the circle.");
    }
    public void calculatePerimeter(){
        double circum = 2*3.14*radius;
        System.out.println(circum + " this is the perimeter.");
    }
}
public class DayTwentyone{
    public static void main(String[] args) {
        Circle34 c1 = new Circle34(8);
        Triangle34 t1 = new Triangle34(5,6,7);

        c1.calculateArea();
        c1.calculatePerimeter();
        t1.calculateArea();
        t1.calculatePerimeter();
        
    }
}