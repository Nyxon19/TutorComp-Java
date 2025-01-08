public class DaySix {
    public static void main(String[] args) {
        
        /*         *
                  ***
                 *****
                *******
               *********   */
        int d = 1;
        for(int a = 4; a>=0; a--){
            for(int b = 1; b<=a; b++){
                System.out.print(" ");
            }
            
            for(int c = 1; c<=d; c++){
                System.out.print("*");
            }
            d=d+2;

            System.out.println();
        }

        /* 123454321
            1234321
             12321
              121
               1       */

        for(int i=5;i>=1;i--){
            for(int k=5;k>i;k--){
                 System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                 System.out.print(j);
            }  
            for(int j=i-1;j>=1;j--){
                 System.out.print(j);
            } 
            System.out.println();
        }

        /* 123454321
            2345432
             34543
              454
               5    */

        for(int i=1;i<=5;i++){
            for(int k=1;k<i;k++){
                 System.out.print(" ");
            }
            for(int j=i;j<=5;j++){
                 System.out.print(j);
            }  
            for(int j=4;j>=i;j--){
                 System.out.print(j);
            } 
            System.out.println();
        }

        /*       1
                121
               12321
              1234321
             123454321  */
        int c = 4;
        for(int i = 1;i<=5; i++){
            for(int j = 1; j<=c; j++){
                System.out.print(" ");
            }
            c--;
            for(int k = 1; k<=i; k++){
                System.out.print(k);
            }
            for(int k = i-1; k>=1; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
