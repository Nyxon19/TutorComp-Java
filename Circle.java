import java.util.Scanner;
public class Circle {
    double radius;
    double area;

    void get_radius(double a){
        radius = a;
    }

    void computeAndPrintArea(){
        area = 3.14 * radius * radius;
        System.out.print(area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the radius of the circle?");
        double b = sc.nextDouble();
        Circle c1 = new Circle();
        c1.get_radius(b);
        System.out.println("the area of the circle is --> ");
        c1.computeAndPrintArea();
    }
}
