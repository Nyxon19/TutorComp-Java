public class DayFiveHW {
    public static void main(String[] args) {
        /*
         * 5
         * 45
         * 345
         * 2345
         * 12345
         */
        for (int a = 5; a >= 1; a--) {
            for (int b = a; b <= 5; b++) {
                System.out.print(b);
            }
            System.out.println("");
        }

        System.out.println("");

        /*
         * 5
         * 54
         * 543
         * 5432
         * 54321
         */
        for (int c = 5; c >= 1; c--) {
            for (int d = 5; d >= c; d--) {
                System.out.print(d);
            }
            System.out.println("");
        }

        System.out.println("");

        /*
         * 12345
         * 1234
         * 123
         * 12
         * 1
         */
        for (int e = 5; e >= 1; e--) {
            for (int f = 1; f <= e; f++) {
                System.out.print(f);
            }
            System.out.println("");
        }

        System.out.println("");

        /*
         * 54321
         * 5432
         * 543
         * 54
         * 5
         */
        for (int g = 1; g <= 5; g++) {
            for (int h = 5; h >= g; h--) {
                System.out.print(h);
            }
            System.out.println("");
        }
    }
}
