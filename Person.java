import java.util.Scanner;
class Person1 {
    Scanner sc = new Scanner(System.in);
    String name;
    String lName;
    void getFirstName(){
        System.out.println("What is your first name?");
        name = sc.nextLine();
        sc.nextLine();
    }
    void getLasttName(){
        System.out.println("What is your last name?");
        lName = sc.nextLine();
        sc.nextLine();
    }
}
class Employee extends Person1{
    int ID;
    void getEmployeeID(){
        System.out.println("What is your employee ID?");
        ID = sc.nextInt();
        System.out.println("");
    }
    void printData(){
        System.out.println("This is your first name --> " + name);
        System.out.println("This is your last name --> " + lName);
        System.out.println("This is your employee Id --> " + ID);
    }
}    
public class Person{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.getFirstName();
        e1.getLasttName();
        e1.getEmployeeID();
        e1.printData();
    }
}

