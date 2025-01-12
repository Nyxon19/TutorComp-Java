import java.util.Scanner;

public class Dog {
    String color;
    String name;
    Dog(){
        color = "white";
        name = "Peter";
    }
    Dog(String col, String nam){
        color = col;
        name = nam;
    }
    void print(){
        System.out.println("Color of dog --> " + color);
        System.out.println("Color of dog --> " + name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        

        System.out.println("What is the color of the dog?");
        String a = sc.nextLine();

        sc.nextLine();

        System.out.println("What is the name of the dog?");
        String b = sc.nextLine();

        Dog d3 = new Dog(a,b);
        d1.print();
        d2.print();
        d3.print();


    }
}
