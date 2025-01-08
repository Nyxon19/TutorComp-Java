import java.util.Scanner;

public class DayTwoHW{
  public static void main(String [] argts){
    Scanner eligibility = new Scanner(System.in);
    System.out.println("Enter your marks in Math: ");
    int math1 = eligibility.nextInt();

    System.out.println("Enter your marks in Physics: ");
    int physics1 = eligibility.nextInt();
    
    System.out.println("Enter your marks in Chemistry: ");
    int chemistry1 = eligibility.nextInt();

    eligibility.close();

    passingGradeChecker(math1, physics1, chemistry1);

    System.out.println("Marks in Math: " + math1 + ". Marks in Physics: " + physics1 + ". Marks in Chemistry: " + chemistry1 + ".");
  }
  static void passingGradeChecker(int math, int physics, int chemistry){
    if(math>=55 && physics>=65 && chemistry>=50){
      if(math+physics+chemistry>=190 || math+physics>=140){
        System.out.println("You are eligible.");
      }else{
        System.out.println("You are not eligible.");
      }
    }else{
      System.out.println("You are not eligible.");
    }
  }
}