import java.util.Scanner;
public class Account {
    int accountNumber;
    double balance;
    Account(int a, double b){
        if(accountNumber <= 0){
            System.err.println("Error - Cannot be less than or equal to 0");
        }
        else if(balance <= 0){
            System.err.println("Error - Cannot be less than or equal to 0");
        }else{
            accountNumber = a;
            balance = b;
        }
        
    }
    void Print(){
        System.out.println("Account Number --> " + accountNumber);
        System.out.println("Balance --> " + balance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the Account Number?");
        int a = sc.nextInt();
        System.out.println("What is the balance in the account?");
        double b = sc.nextDouble();
        Account a1 = new Account(a,b);
        a1.Print();
    }
}
