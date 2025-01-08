import java.util.Scanner;

public class DaySix_SevenHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        daySixHW();

        System.out.println("What number do you want to check to see if it is a palandrome?");
        int l = sc.nextInt();
        daySevenHW(l);
    }
    static void daySixHW(){
        /*. 543212345
             4321234
              32123
               212
                1  */
        
        int b = 0;
        for(int a = 5; a>=1; a--){
            for(int c = 1; c<=b; c++){
                System.out.print(" ");
            }
            b++;
            for(int d = a; d>=1; d--){
                System.out.print(d);
            }
            for(int d = 2; d<=a; d++){
                System.out.print(d);
            }
            System.out.println("");
        }

        System.out.println("");
        
        /*     5
              545
             54345
            5432345
           543212345 */
        for(int e = 5; e>=1;e--){
            for(int f = e; f>=2;f--){
                System.out.print(" ");
            }
            for(int g = 5; g>=e; g--){
                System.out.print(g);
            }
            for(int g = e+1; g<=5; g++){
                System.out.print(g);
            }
            System.out.println("");
        }
        
        System.out.println("");

        /*  1
            01
            101
            0101
            10101 */
        int m = 1;
        for(int l = 1; l<=5; l++){
            if(l%2==1){
                m=1;
            }else{
                m=0;
            }
            for(int n = m; n<=l; n++){
                System.out.print(m);
            }
            System.out.println("");
        }

        System.out.println();

        /*  1
            01
            101
            0101
            10101 */
        int p;
        for(int q = 1; q<=5; q++){
            for(int o = q; o>0; o--){
                p = o%2;
                System.out.print(p);
            }
            System.out.println();
        }

        System.out.println("");

        /*  1
            11
            121
            1331
            14641 */
        int s = 1;
        for(int r = 1; r<=5; r++){
            System.out.println(s);
            s = s * 11;
        }
        

        
    }
    static void daySevenHW(int j){
        int h = 0;
        int i = 0;
        int k = j;
        while(j!=0){
            h = j%10;
            i = (i*10) + h;
            j=j/10;
        }
        if(i==k){
            System.out.println("This number is a palandrome");
        }else{
            System.out.println("This number is not a plandrome");
        }
    }
}