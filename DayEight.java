import java.util.Scanner;

//Do while loop
public class DayEight{
    public static void main(String[] args){
        int i=1;                       //Initialization
        do{
            System.out.println(i);       //Body of loop
            i=i+1;                       //update
        }while(i>=10);                //test expression

        //WAP to perform arthimetic operations depending on user choice

        Scanner sc = new Scanner(System.in);
        int a = 0;
    
        System.out.println("Enter the first number");
        int b = sc.nextInt();
        System.out.println("Enter the second number");
        int c = sc.nextInt();
    
        do{
            System.out.println("What operation do you want to perform?");
            System.out.println("Type 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division");
            int d = sc.nextInt();
      
            switch(d){
                case 1:
                    System.out.println("Addition is: "+ b+c);
                    break;
                case 2:
                    System.out.println("Subtraction is: "+ (b-c));
                    break;
                case 3: 
                    System.out.println("Multiplication is: "+ b*c);
                    break;
                case 4:
                    System.out.println("Division is: "+ b/c);
                    break;
                default:
                    System.out.println("Enter correct operator");
            }
            System.out.println("Type 1 to continue doing operations, or any other number to exit");
            b = sc.nextInt();
        }while(b==1); 

        System.out.println("");
        System.out.println("-------------------------------------------------------------");
        System.out.println("");

        //Write a program that calculates the simple interest for a given principal amount, interest rate, and time period. Use a do-while loop to allow the user to input values multiple times.
        int e;
        do{
            System.out.println("Enter the principal amount.");
            int f = sc.nextInt();

            System.out.println("Enter the interest rate.");
            int g = sc.nextInt();

            System.out.println("Enter the time period.");
            int h = sc.nextInt();

            System.out.println("The interest is --> " + f*g*h);

            System.out.println("If you want to do this program again type 1, otherwise type any other number.");
            e = sc.nextInt();
        }while(e==1);

        System.out.println("");
        System.out.println("-------------------------------------------------------------");
        System.out.println("");

        // Write a program that calculates and prints the sum of prime numbers up to a specified limit (e.g., 50) using a do-while loop.
        int j;
    
        System.out.println("Enter the number till which you want to find sum of prime numbers.");
        int k = sc.nextInt();
        j=1;
        do{
            if(prime(j)==1)
                System.out.println(j);
            j++;
        }while(j<=k);
    }
  
    static int prime(int c){
        for(int i = 2; i<c;i++){
            if(c%i==0){
                return 0;
            }
        }
        return 1;
    }
}