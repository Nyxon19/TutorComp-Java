/*interface Animal{
    public void animalSound();
    public void sleep();
}
// if not all of the functions from the interface class in the implemented classs are made then the implemented class becomes absract
class Pig implements Animal{
    public void animalSound(){
        System.out.println("Pig says: wee wee");
    }
    public void sleep(){
        System.out.println("ZZZzzz");
    }
}*/

// when implementing multiple interfaces you have to include all the functions from the used interfaces
interface Color{
    public void setColor();
}

interface Shape3{
    public void getArea();
}
class Triangle3 implements Shape3,Color{
    private double base;
    private double height;
    Triangle3(double base, double height){
        this.base = base;
        this.height = height;
    }
    public void getArea(){
        System.out.println("This is the area: " + base*height/2);
    }
    public void setColor(){
        System.err.println("This color is now blue");
    }
}
class Rectangle3 implements Shape3{
    private double base;
    private double height;
    Rectangle3(double base, double height){
        this.base = base;
        this.height = height;
    }
    public void getArea(){
        System.out.println("This is the area: " + base*height);
    }
}
class Circle3 implements Shape3{
    private double radius;
    Circle3(double radius){
        this.radius = radius;
    }
    public void getArea(){
        System.out.println("This is the area: " + radius*radius*3.14);
    }
}

public class DayTwentyTwo {
    public static void main(String[] args) {
        /*Pig p1 = new Pig();
        p1.animalSound();
        p1.sleep();*/

        Circle3 c1 = new Circle3(3.3);
        Triangle3 t1 = new Triangle3(3,2);
        Rectangle3 r1 = new Rectangle3(3,2);
        c1.getArea();
        t1.getArea();
        r1.getArea();
        t1.setColor();
    }
}