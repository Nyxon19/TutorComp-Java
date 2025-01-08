abstract class Robot{
    public void start(){
        System.out.println("Starting Robot...");
    }
    abstract public void stop();
}
interface Walkable{
    public void walk();
}
interface Chargeable{
    public void chargeBattery();
}
//ONLY EXTEND ONE CLASS BUT IMPLEMENT MULTIPLE INTERFACES
/*abstract class Robo{
    abstract public void announce();
}*/
class SmartRobot extends Robot implements Walkable,Chargeable{
    public void stop(){
        System.out.println("Stopping Robot...");
    }
    public void walk(){
        System.out.println("Robot is walking.");
    }
    public void chargeBattery(){
        System.out.println("Charging Robot Battery...");
    }

}
public class DayTwentyTwo3 {
    public static void main(String[] args) {
        SmartRobot sr1 = new SmartRobot();
        sr1.stop();
        sr1.walk();
        sr1.chargeBattery();
    }
}
