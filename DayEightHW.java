import java.util.Scanner;

public class DayEightHW {
    public static void main(String[] args) {
        

        System.out.println("Welcome to Calculator!");
        calculator();

    }
    static void calculator(){
        Scanner sc = new Scanner(System.in);
        int d = 0;
        int e = 0;
        int f = 0; 
        do{
            if(e==1){
                System.out.println("Do you wish to use the answer from the previous operation?");
                System.out.println("Type 1 to say yes, 2 to say no");
                f = sc.nextInt();
            }

            if(f==1){
                System.out.println("Enter the second number: ");
                int b = sc.nextInt();

                System.out.println("Type 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division");
                int c = sc.nextInt();
            
            
                if(c==1){
                    d = d + b;
                }else if(c==2){
                    d = d - b;
                }else if(c==3){
                    d = d * b;
                }else if(c==4){
                    d = d / b;
                }

                switch(c){
                    case 1:
                        System.out.println("Addition is: "+ d);
                        break;
                    case 2:
                        System.out.println("Subtraction is: "+ d);
                        break;
                    case 3: 
                        System.out.println("Multiplication is: "+ d);
                        break;
                    case 4:
                        System.out.println("Division is: "+ d);
                        break;
                    default:
                        System.out.println("Enter correct operator");
                }

                System.out.println("Do you wish to continue?");
                System.out.println("Type 1 for Yes, 2 for No");
                e = sc.nextInt();
            }else{
                System.out.println("Enter the first number: ");
                int a = sc.nextInt();
                System.out.println("Enter the second number: ");
                int b = sc.nextInt();

                System.out.println("Type 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division");
                int c = sc.nextInt();
            
            
                if(c==1){
                    d = a + b;
                }else if(c==2){
                    d = a - b;
                }else if(c==3){
                    d = a * b;
                }else if(c==4){
                    d = a / b;
                }

                switch(c){
                    case 1:
                        System.out.println("Addition is: "+ d);
                        break;
                    case 2:
                        System.out.println("Subtraction is: "+ d);
                        break;
                    case 3: 
                        System.out.println("Multiplication is: "+ d);
                        break;
                    case 4:
                        System.out.println("Division is: "+ d);
                        break;
                    default:
                        System.out.println("Enter correct operator");
                }

                System.out.println("Do you wish to continue?");
                System.out.println("Type 1 for Yes, 2 for No");
                e = sc.nextInt();
            }
            
            
        }while(e==1);
    }
}