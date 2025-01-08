import java.util.Scanner;
public class DayEleven {
    public static void main(String[] args) {
        sumOfRowsAndColumns();
    }
    static void sumOfRowsAndColumns(){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows and columns do you want in the DDA?");
        int a = sc.nextInt();

        int d[][] = new int [a][a];

        System.out.println("Enter values of DDA.");
        for(int b = 0;b<a; b++){
            for(int c = 0; c<a; c++){
                d[b][c] = sc.nextInt();
            }
        }

        
        //rows
        System.out.println("Sum of Rows -->");
        int rowSum[] = new int [a];
        for(int b = 0;b<a; b++){
            rowSum[b] = 0;
            for(int c = 0; c<a; c++){
                rowSum[b] += d[b][c];
            }
        }
        for(int e = 0; e<a; e++){
            System.out.println("r" + rowSum[e]);
        }

        System.out.println("");

        //column
        System.out.println("Sum of columns -->");
        int columnSum[] = new int [a];
        for(int b = 0;b<a; b++){
            columnSum[b] = 0;
            for(int c = 0; c<a; c++){
                columnSum[b] += d[c][b];
            }
        }
        for(int e = 0; e<a; e++){
            System.out.println("c" + columnSum[e]);
        }
    }
}
