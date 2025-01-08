import java.util.Scanner;


public class DayTwo {
  public static void main(String[] args) {
    /*Scanner sc = new Scanner(System.in);
    System.out.println("Input the number you want to check to see if it is even or odd: ");
    int number=sc.nextInt();
    sc.close();
    evenOrOdd(number);*/

    //to find year is leap or not
    //leapYearChecker(1900);

    // largest of 3 numbers
    //largestNumberChecker(3, 324234, 34);

    // to find character entered is vowel or not
    vowelChecker('d');
  }

  //seeing to check if a number is even or odd
  static void evenOrOdd(int num){
    if(num % 2 == 0)
      System.out.println("Even");
    else
      System.out.println("Odd");
  }

  static void leapYearChecker(int year){
    if(year%400 == 0 ){
      System.out.println("Leap Year");
    } else if(year%4==0 && year%100 != 0){
      System.out.println("Leap Year");
    } else{
       System.out.println("Not Leap Year");
      
    }
  }

  static void largestNumberChecker(int number1, int number2, int number3){
    if(number1>number2 && number1>number3){
      System.out.println("Number 1 is the greatest number!");
    }else if(number2>number3){
      System.out.println("Number 2 is the greatest number!");
    }else{
      System.out.println("Number 3 is the greatest number!");
    }
  }

  static void vowelChecker(char vowel){
    if(vowel == 'a'|| vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u'){
      System.out.println(vowel + " is a vowel.");
    }else{
      System.out.println(vowel + " is not a vowel."); 
    }
  }
}

/* Write a program to determine eligibility for admission to a professional course based on the following criteria: Go to the editor
Eligibility Criteria : Marks in  Maths >=65 and Marks in Phy >=55 and Marks in Chem>=50 and Total in all three subject >=190 or Total in Maths and Physics >=140 
-------------------------------------
Input the marks obtained in Physics :65 Input the marks obtained in Chemistry :51 Input the marks obtained in  Mathematics :72 Total marks of Maths, Physics 
and Chemistry : 188 Total marks of Maths and Physics : 137 The candidate is not eligible.*/