import java.util.Scanner;

class DayFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * for (int i=1;i<=5;i++){
         * for(int j=1;j<=i;j++){
         * System.out.print("* ");
         * }
         * System.out.println();
         * }
         */

        /* 
        *****
        ****
        ***
        **
        *     */
        for (int a = 5; a >= 1; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print(b + " ");
            }
            System.out.println(" ");
        }

        /*
         * 12345
         * 2345
         * 345
         * 45
         * 5
         */
        for (int a = 1; a <= 5; a++) {
            for (int b = a; b <= 5; b++) {
                System.out.print(b + " ");
            }
            System.out.println("");
        }

        /*
         * 54321
         * 5432
         * 543
         * 54
         * 5
         */
        for (int a = 1; a <= 5; a++) {
            for (int b = 5; b >= a; b--) {
                System.out.print(b + " ");
            }
            System.out.println("");
        }
        /*
         * 1
         * 21
         * 321
         * 4321
         * 54321
         */
        for (int i = 1; i <= 5; i++) {
            for (int b = i; b >= 1; b--) {
                System.out.print(b + " ");
            }
            System.out.println("");
        }
    }
}