import java.util.Scanner;
public class Employee1 {
    private int empID;
    private String empName;
    private double salary;

    Employee1(int empID, String empName, double salary){
        this.empID = empID;
        this.empName = empName;
        this.salary = salary;
    }
    void bestEmployees(){
        if(salary>=5000){
            System.out.println(empName + " has a salary greater than $5000");
        }
    }
    public static void main(String[] args) {
        int number = 3;
        Employee1[] Employees = new Employee1[number];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<number;i++){
            sc.nextLine();
            System.out.println("What is the name of the employee?");
            String a = sc.nextLine();
            System.out.println("What is the employee ID?");
            int b = sc.nextInt();
            System.out.println("What is the salary of the employee?");
            double c = sc.nextDouble();
            Employees[i] = new Employee1(b, a, c);
        }
        System.out.println("Finding employees with salary greater than 5000...");
        for(int i = 0;i<number;i++){
            Employees[i].bestEmployees();
        }
    }
}
