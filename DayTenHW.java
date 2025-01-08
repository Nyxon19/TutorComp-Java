import java.util.Scanner;

public class DayTenHW {
    public static void main(String[] args) {
        nonDiagnolElementsOfDDA();
        matrixMultiplication();
    }

    static void nonDiagnolElementsOfDDA(){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows  & columns do you want in the DDA?");
        int a = sc.nextInt();
        

        int[][] c = new int[a][a];

        System.out.println("Enter values of DDA.");
        for(int d = 0;d<a; d++){
            for(int e = 0; e<a; e++){
                c[d][e] = sc.nextInt();
            }
        }

        for(int f = 0; f<a; f++){
            for(int g = 0; g<a; g++){
                if(f==g||f+g==a-1){
                    c[f][g] = 0;
                }
            }
        }

        
        for(int h = 0; h<a; h++){
            for(int g = 0; g<a; g++){
                System.out.print(c[h][g]+" ");
            }
            System.out.println("");
        }
        
    }
    static void matrixMultiplication(){
        int i[][] = {{1,2},{5,6}};
        int j[][] = {{1,2},{5,6}};
        int k[][] = new int [2][2];

        for (int l = 0; l<2; l++){
            for(int m = 0; m<2; m++){
                k[l][m] = 0;
                for(int n = 0; n<2; n++){
                    k[l][m] += i[l][n]*j[n][m];
                }
            }
        }
        for(int o = 0; o<2;o++){
            for(int p = 0; p<2; p++){
                System.out.println(k[o][p] + " ");
            }
            System.out.println("");
        }
    }
}
