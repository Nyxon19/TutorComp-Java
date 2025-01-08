class SubBankAcount{
    void deposit(){
        System.out.println("Deposite 10 dollars min");
    }
    void withdraw(int a){
        System.out.println("Withdraw 50 max");
    }
}
class CheckingAcount extends SubBankAcount{
    void withdraw(int b, int c){
        System.out.println("Withdraw 30 max");
    }
}
class SavingsAcount extends SubBankAcount{
    void withdraw(double d){
        System.out.println("Withdraw 40 max");
    }
}
public class BankAcount{
    public static void main (String[] args){
        SubBankAcount ba1 = new SubBankAcount();
        CheckingAcount ca1 = new CheckingAcount();
        System.out.println("");
        ba1.withdraw(9);
        ba1.withdraw(3);
    }
}