interface Sport{
    public void playSport(String sport);
}
interface Instrument{
    public void playInstrument(String instrument);
}
class Student3 implements Sport,Instrument{
    public void playSport(String sport){
        System.out.println("This student plays " + sport);
    }
    public void playInstrument(String instrument){
        System.out.println("Plays an Instrument " + instrument);
    }
}

public class DayTwentyTwo2 {
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        s1.playSport("tennis");
        s1.playInstrument("Clarinet");
    }
}
