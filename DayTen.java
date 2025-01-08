import java.util.Scanner;

public class DayTen {
    public static void main(String[] args) {
        //double dimensional array
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows do you want in the first & second DDA?");
        int rows = sc.nextInt();
        System.out.println("How many columns do you want in the first & second DDA?");
        int columns = sc.nextInt();

        int[][] ar1 = new int[rows][columns];
        int[][] ar2 = new int[rows][columns];
        int[][] mergedar3 = new int[rows][columns];
        
        System.out.println("Enter values of first DDA.");
        for(int a = 0; a<rows; a++){
            for(int b = 0; b<columns; b++){
                ar1[a][b] = sc.nextInt();
            }
        }
        System.out.println("Enter values of second DDA.");
        for(int a = 0; a<rows; a++){
            for(int b = 0; b<columns; b++){
                ar2[a][b] = sc.nextInt();
            }
        }
        for(int a = 0; a<rows; a++){
            for(int b = 0; b<columns; b++){
                mergedar3[a][b] = ar1[a][b]+ar2[a][b];
            }
        }

        for(int a = 0; a<rows; a++){
            for(int b = 0; b<columns; b++){
                System.out.print(mergedar3[a][b]+ " ");
            }
            System.out.println("");
        }
        




        
        System.out.println("How many rows do you want in the first & second DDA?");
        int c = sc.nextInt();
        System.out.println("How many columns do you want in the first & second DDA?");
        int d = sc.nextInt();

        int[][] e = new int[c][d];
        
        System.out.println("Enter values of first DDA.");
        for(int f = 0; f<c; f++){
            for(int g = 0; g<d; g++){
                e[f][g] = sc.nextInt();
            }
        }

        for(int f = 0; f<c; f++){
            for(int g = 0; g<d; g++){
                System.out.print(e[g][f]+" ");
            }
            System.out.println("");
        }
        
        
    }
}
