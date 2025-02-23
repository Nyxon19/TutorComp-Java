import java.util.ArrayList;
public class DayTwentySevenHW {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(10);
        ar.add(4);
        ar.add(19);
        ar.add(2);
        ar.add(20);

        for(int i = 0; i <ar.size(); i++){
            int a = 0;
            for(int j = i+1; j<ar.size(); j++){
                if(ar.get(i) > ar.get(j)){
                    a = a + 1;
                }
            }

            if(a == ar.size() - i - 1){
                System.out.println(ar.get(i));
            }
            
            System.out.println("------");
        }
    }
}
