import java.util.Scanner;

public class DayFour{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the number you want to check to see if it is a prime number?");
        int number1 = sc.nextInt();
        primeNumber(number1);

        for(int i=1;i<=10;i+=2)
        System.out.println(i);

        // n.......15,10,5
        System.out.println("Until what number do you want to print multiples of 5 until?");
        int number = sc.nextInt();
        for(int a=number; a>=1; a-=5){
        System.out.println(a);
        }
    
        // 1,3,6,10,15.....n
        System.out.println("Until what number do you want to print series?");
        int number3 = sc.nextInt();
        int b = 1;
        for(int a =1; a<=number3; a=a+b){
        System.out.println(a);
        b=b+1;
        }

        // febonacii Series: 0,1,1,2,3,5,8......n
        System.out.println("Until what number do you want to print the fibbonacii series?");
        int number2 = sc.nextInt();
        int  a=0, b1=1;
        int c = 0;
        System.out.println(0);
        System.out.println(1);
        for(int i = 1; c<number2; i++){
            c = a+b1;
            System.out.println(c);
            a=b1;
            b1=c;


    }
    }
    
    static void primeNumber(int number){
        int prime=1;
        for(int a = 2; a< number; a++){
            if(number%a==0){
                prime=0;
                break;
            }       
        }
        if(prime==1)
        System.out.println("prime");
        else 
        System.out.println("not prime");
    }
}