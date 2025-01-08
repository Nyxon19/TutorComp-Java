import java.util.Scanner;
class PasswordChecker{
    public boolean checkPassword(String a){
        if(a.length()<10){
            return false;
        }
        int count=0;
        /*for(int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            if(isLetter(ch)){
            } 
        }
        for(int c=0; c<a.length(); c++){
            char ch = a.charAt(c);
            if(isDigit(ch)){
                count++;
            }
        }
        return count>=2;*/
        for(int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            if(isLetter(ch)||isDigit(ch)){
                if(isDigit(ch)){
                    count++;
                }}else{
                    return false;
            }
        }
        return count>=2;
    }
    public boolean isLetter(char ch){
        return(ch >= 'A' && ch<='Z')||(ch>='a' && ch<='z');
    }
    public boolean isDigit(char ch){
        return(ch>='0' && ch<='9');
    }
}
public class DayTwentyFour {
    public static void main(String[] args) {
        PasswordChecker pc1 = new PasswordChecker();
        Main m1 = new Main();
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(pc1.checkPassword(a));
    }
}
