import java.util.Scanner;

public class DayElevenHW {
    public static void main(String[] args) {
        //sparseMatrix();
        identityMatrixConverter();
    }
    static void sparseMatrix(){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows and columns do you want in the DDA?");
        int a = sc.nextInt();

        int b[][] = new int [a][a];
        System.out.println("Enter values of DDA.");
        for(int c = 0;c<a; c++){
            for(int d = 0; d<a; d++){
                b[c][d] = sc.nextInt();
            }
        }

        int g = 0;
        for(int e = 0; e<a; e++){
            for(int f = 0; f<a; f++){
                if(b[e][f] == 0){
                    g+=1;
                }
            }
        }

        if(g>a*a/2){
            System.out.println("This is a Sparse Matrix");
        } else{
            System.out.println("This is not a Sparse Matrix");
        }
    }
    static void identityMatrixConverter(){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows and columns do you want in the DDA?");
        int a = sc.nextInt();

        int b[][] = new int [a][a];
        System.out.println("Enter values of DDA.");
        for(int c = 0;c<a; c++){
            for(int d = 0; d<a; d++){
                b[c][d] = sc.nextInt();
            }
        }

        int g = 0;
        for(int e = 0; e<a; e++){
            for(int f = 0; f<a; f++){
                if(e == f){
                    b[e][f] = 1;
                }
                if(e != f){
                    b[e][f] = 0;
                }
            }
        }
    }
}
