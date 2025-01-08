import java.util.Scanner;

public class DayFourHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Write a program to find sum of all natural numbers till 10
        System.out.println("Until what number do you want to print natural numbers?");
        int naturalNum = sc.nextInt();
        for(int a = 1; a <= naturalNum; a++){
            System.out.println(a);
        }

        // Wap to find factorial of number
        System.out.println("What number do you want to find the factorial of?");
        int factorialNum = sc.nextInt();
        int c = factorialNum;
        for(int b = factorialNum; b>=2; b--){
            c = c*(b-1);
        }
        System.out.println(c);

        //Write a program to read 10 numbers from the keyboard and find their sum and average
        System.out.println("What is the first number in 10 numbers that you want to fidn the average of?");
        double num1 = sc.nextInt();
        System.out.println("What is the second number in 10 numbers that you want to fidn the average of?");
        double num2 = sc.nextInt();
        System.out.println("What is the third number in 10 numbers that you want to fidn the average of?");
        double num3 = sc.nextInt();
        System.out.println("What is the fourth number in 10 numbers that you want to fidn the average of?");
        double num4 = sc.nextInt();
        System.out.println("What is the fifth number in 10 numbers that you want to fidn the average of?");
        double num5 = sc.nextInt();
        System.out.println("What is the sixth number in 10 numbers that you want to fidn the average of?");
        double num6 = sc.nextInt();
        System.out.println("What is the seventh number in 10 numbers that you want to fidn the average of?");
        double num7 = sc.nextInt();
        System.out.println("What is the eighth number in 10 numbers that you want to fidn the average of?");
        double num8 = sc.nextInt();
        System.out.println("What is the ninth number in 10 numbers that you want to fidn the average of?");
        double num9 = sc.nextInt();
        System.out.println("What is the tenth number in 10 numbers that you want to fidn the average of?");
        double num10 = sc.nextInt();
        averageNumCalculator(num1, num2, num3, num4, num5, num6, num7, num8, num9, num10);
        //averageNumCalculator(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
    
    //Write a program to read 10 numbers from the keyboard and find their sum and averag
    static void averageNumCalculator(double c, double d, double e, double f, double g, double h, double i, double j, double k, double l){
        double average = (c+d+e+f+g+h+i+j+k+l)/10;
        System.out.println("The average of the ten numbers is --> " + average);
    }
}
