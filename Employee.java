
import java.util.Scanner;
public class Employee {

    int empID;
    String eName;
    double salary;

    void get_data(int a, String b, double c){
        empID = a;
        eName = b;
        salary = c;
    }

    void print_data(){
        System.out.println("Id: " + empID);
        System.out.println("Name: " + eName);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();
        System.out.println("What is the Id of the first employee?");
        int id1 = sc.nextInt();
        System.out.println("What is the name of the first employee?");
        sc.nextLine();
        String name1 = sc.nextLine();
        System.out.println("What is the salary of the first employee?");
        Double salary1 = sc.nextDouble();
        e1.get_data(id1,name1,salary1);
        e1.print_data();

        Employee e2 = new Employee();
        System.out.println("What is the Id of the second employee?");
        int id2 = sc.nextInt();
        System.out.println("What is the name of the second employee?");
        sc.nextLine();
        String name2 = sc.nextLine();
        System.out.println("What is the salary of the second employee?");
        Double salary2 = sc.nextDouble();
        e2.get_data(id2, name2,salary2);
        
        
        e1.print_data();
        e2.print_data();
    }
    
}
