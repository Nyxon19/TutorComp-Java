abstract class BankAccount{
    public abstract void deposit1(double a);
    public abstract void withdraw1(double b);
}
class SavingsAccount extends BankAccount{
    private double savings = 0;
    public void deposit1(double a){
        System.out.println("Inputting money into Savings Account");
        savings += a;
        System.out.println("Your balance is : "+ savings);
    }
    public void withdraw1(double b){
        System.out.println("Taking money out of Savings Account");
        savings -= b;
        System.out.println("Your balance is : "+ savings);
    }
}
class CurrentAccount extends BankAccount{
    private double current;
    public void deposit1(double a){
        System.out.println("Inputting money into Current Account");
        current += a;
        System.out.println("Your balance is : "+ current);
    }
    public void withdraw1(double b){
        System.out.println("Taking money out of Current  Account");
        current -= b;
        System.out.println("Your balance is : "+ current);
    }
}
public class DayTwentyOneHW {
    public static void main(String[] args) {
        CurrentAccount c1 = new CurrentAccount();
        SavingsAccount s1 = new SavingsAccount();

        s1.deposit1(383.9); 
        s1.withdraw1(23.93);

    }

}
