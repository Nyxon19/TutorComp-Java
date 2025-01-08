import java.util.Scanner;

public class DayThreeHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What shape do you want to calculate the area of?");
        String shape = sc.nextLine();

        if("square".equalsIgnoreCase(shape)){
            System.out.println("How many inches is the side of the square?");
            double squareSide = sc.nextDouble();
            System.out.println("The area of the shape is --> " + squareSide*squareSide);
        }else if("rectangle".equalsIgnoreCase(shape)){
            System.out.println("How many inches is one side of the rectangle?");
            double rectangleSide1 = sc.nextDouble();
            System.out.println("How many inches is the other side?");
            double rectangleSide2 = sc.nextDouble();
            System.out.println("The area of the shape is --> " + rectangleSide1*rectangleSide2);
        }else if("circle".equalsIgnoreCase(shape)){
            System.out.println("What is the radius of the circle?");
            double circleRadius = sc.nextDouble();
            System.out.println("The approximated area of the shape is --> " + 3.14*(circleRadius*circleRadius));
        }else if("trapezoid".equalsIgnoreCase(shape)){
            System.out.println("How many inches is the top side of the trapezoid?");
            double trapezoidTopSide = sc.nextDouble();
            System.out.println("How many inches is the bottom side of the trapezoid?");
            double trapezoidBottomSide = sc.nextDouble();
            System.out.println("What is the height of the trapezoid?");
            double trapezoidHeight = sc.nextDouble();
            System.out.println("The area of the shape is --> " + (trapezoidTopSide+trapezoidBottomSide)*trapezoidHeight);
        }else if("triangle".equalsIgnoreCase(shape)){
            System.out.println("How many inches is the base of the triangle?");
            double triangleBase = sc.nextDouble();
            System.out.println("How many inches is the height of the triangle?");
            double triangleHeight = sc.nextDouble();
            System.out.println("The area of the shape is --> " + (triangleBase*triangleHeight)/2);
        }

        sc.close();
    }
}
