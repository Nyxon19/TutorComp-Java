import java.util.Scanner;

public class Student {
    int studentId;
    String studentName;
    double studentGrade;
    Student(){
        studentId = 00000;
        studentName = "Blank";
        studentGrade = 0;
    }
    Student(int id, String name, double grade){
        studentId = id;
        studentName = name;
        studentGrade = grade;
    }
    void print(){
        System.out.println("Id of student --> " + studentId);
        System.out.println("name of student --> " + studentName);
        System.out.println("grade of student --> " + studentGrade);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is the id of the student?");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("What is the name of the student?");
        String b = sc.nextLine();
        System.out.println("What is the grade of the student?");
        double c = sc.nextDouble();
        Student s1 = new Student(a,b,c);
        s1.print();
        System.out.println("");

        System.out.println("What is the id of the student?");
        a = sc.nextInt();
        sc.nextLine();
        System.out.println("What is the name of the student?");
        b = sc.nextLine();
        System.out.println("What is the grade of the student?");
        c = sc.nextDouble();
        Student s2 = new Student(a,b,c);
        s2.print();
        System.out.println("");

        
    }


}
