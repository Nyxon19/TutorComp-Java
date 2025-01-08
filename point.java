import java.util.Scanner;

public class point{

    int x;
    int y;
    point(int a, int b){
        x=a;
        y=b;
    }
    point(double a, double b){
        x=(int)a;
        y=(int)b;
    }
    void print(){
        System.out.println("Value of x --> " + x);
        System.out.println("Value of y --> " + y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is the value of x?");
        int a = sc.nextInt();
        System.out.println("What is the value of y?");
        int b = sc.nextInt();
        point p1 = new point(a,b);
        p1.print();

        System.out.println("What is the value of x?");
        double a1 = sc.nextDouble();
        System.out.println("What is the value of y?");
        double b1 = sc.nextDouble();
        point p2 = new point(a1,b1);
        p2.print();
    }
}