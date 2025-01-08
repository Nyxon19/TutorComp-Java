/* Write a program to calculate and print the electricity bill of a given customer. The customer ID, name, and unit consumed by the user should be captured from the keyboard to display the total amount to be paid to the customer.

The charge are as follow :

Unit	Charge/unit
upto 199	@1.20
200 and above but less than 400	@1.50
400 and above but less than 600	@1.80
600 and above	@2.00
If bill exceeds Rs. 400 then a surcharge of 15% will be charged and the minimum bill should be of Rs. 100/-*/
import java.util.Scanner;

public class DayThree{
  public static void main(String[] args){
    Scanner electricityBill = new Scanner(System.in);
      
    System.out.println("What is your customer ID?");
    int iD = electricityBill.nextInt();

    electricityBill.nextLine();
    System.out.println("What is your name?");
    String customerName = electricityBill.nextLine();

    System.out.println("How many units have you used this month?");
    int units = electricityBill.nextInt();
    
    
    System.out.print(customerName + " with the ID of " + iD + " has to pay  $"  );
    electricityBillCalculator(units);
    System.out.print(" because he used " + units + " units.");

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter character");
    char vowel1 = sc.next().charAt(0);

    switch(vowel1){
      case 'a':
      case 'A':
        System.out.println("The vowel is A.");
        break;
      case 'e':
      case 'E':
        System.out.println("The vowel is E.");
        break;
      case 'i':
      case 'I':
        System.out.println("The vowel is I.");
        break;
      case 'o':
      case 'O':
        System.out.println("The vowel is O.");
        break;
      case 'u':
      case 'U':
        System.out.println("The vowel is U.");
        break;
      default:
        System.out.println("This is not a vowel.");
    }    
    
  }



  
  static void electricityBillCalculator(int units){
    double bill = 0;
    if(units <= 199){
      bill = units * 1.20;
    }else if(units>=200 && units<400){
      bill = units * 1.5;
    }else if(units>=400 && units<=600){
      bill = units * 1.8;
    }else if(units>=600){
      bill = units * 2;
    }

    if(units>=400){
      bill = bill*1.15;
    }else if (bill<100)
      bill=100;

    System.out.print(bill);
  }
}