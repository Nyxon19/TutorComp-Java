import java.util.Scanner;
class Reservation{
    Scanner sc = new Scanner(System.in);
    int reservationId;
    String customerName;
    String date;
    void getData(){
        System.out.println("What is your reservation ID?");
        reservationId = sc.nextInt();
        System.out.println("What is your name?");
        sc.nextLine();
        customerName = sc.nextLine();
        System.out.println("What is the date?");
        date = sc.nextLine();
    }
    void printData(){
        System.out.println("This is your reservation ID --> " + reservationId);
        System.out.println("This is your name --> " + customerName);
        System.out.println("This is your reservation date --> " + date);
    }
}
class resortReservation extends Reservation{
    int hotelNumber;
    int beachSpot;
    void getData(){
        System.out.println("What is your hotel number?");
        hotelNumber = sc.nextInt();
        System.out.println("What number is your beach spot?");
        beachSpot = sc.nextInt();
        super.getData();
    }
    void printData(){
        System.out.println("Your hotel number is --> " + hotelNumber);
        System.out.println("Your beach spot is --> " + beachSpot);
        super.printData();
    }
}
public class res{
    public static void main(String[] args){
        resortReservation rr1 = new resortReservation();
        rr1.getData();
        rr1.printData();
    }
}