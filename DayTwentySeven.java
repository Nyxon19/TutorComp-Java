import java.util.ArrayList;
public class DayTwentySeven {
    public static void main(String[] args) {
        // ArrayList<String> alist = new ArrayList<String>();
        // alist.add("blue");
        // alist.add("green");
        // alist.add("red");
        // alist.add("yellow");
        // alist.add("teal");
        // alist.add("magenta");
        // alist.add("peach");
        // alist.add("purple");
        // alist.add("pink");
        // for(int a = 0; a<alist.size(); a++){
        //     System.out.println(alist.get(a));
        // }
        
        ArrayList<Integer> blist = new ArrayList<Integer>();
        blist.add(5);
        blist.add(4);
        blist.add(3);
        blist.add(2);
        blist.add(1);
        int b = 0;
        for(int c = 0; c<blist.size(); c++){
            b = b + blist.get(c);
        }
        System.out.println(b);
        int d = 0;
        for(int c = 0; c<blist.size(); c++){
            if( 2 == blist.get(c)){
                System.out.println("true");
                d = 1;
            }
        }
        if(d != 1){
            System.out.println("False");
        }
    }
}
