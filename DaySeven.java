import java.util.Scanner;

public class DaySeven {
    public static void main(String[] args) {
        int num=1;  // initialization : starting value
        while(num<=10){  // text expression: ending value
            System.out.println(num);   //Body of loop
            num=num+2;   //update: increment or decrement
        } // loop closed

        //WAP to find the sum of numbers entered by user, program should take multiple values until user presses -1


        Scanner sc = new Scanner(System.in);
        int a=0;
        int b = 0;
        while(a!=-1){
            System.out.print("Enter number, press -1 to exit --> ");
            a=sc.nextInt();
            b=b+a;
        }
    
        System.out.println("Sum of total numbers"+(b+1));
    
        int c=0;
        int d = 0;
        int e = 0;
        while(a!=-1){
            System.out.print("Enter number, press -1 to exit --> ");
            c=sc.nextInt();
            if(c%2==0){
            d=d+c;
            }else{
            e = e + c;
            }
        }
        System.out.println("sum of even numbers --> " + (d));
        System.out.println("sum of odd numbers --> " + (e+1));

        //WAP to find count of positive and negative numbers entered by user , it should take multiple values until user presses 0

        int f = 1;
        int g = 0;
        int h = 0;
        while(a!=0){
            System.out.print("Enter number, press -1 to exit --> ");
            f=sc.nextInt();
            if(f<0){
                g++;
            }else if(f>0){
                h++;
            }
        }
        System.out.println("Count of positive numbers --> " + h);
        System.out.println("Count of negative numbers --> " + g);

        //WAP to find sum of number of digits entered by the user 543=12
        int i=0,j;
        System.out.println("Enter any number");
        int k = sc.nextInt();
        while(k!=0){
            j=k%10;
            i=i+j;
            k=k/10;
        }
        System.out.println("Sum of digits is:"+ i);

    //WAP to find reverse of number entered by the user

    int l=0;
    System.out.println("Enter any number");
    int m = sc.nextInt();
    while(m!=0){
      a=m%10;
      l=(l*10)+ m;
      m=m/10;
    }
    System.out.println("Reverse of number is:"+ l );
    }
}
