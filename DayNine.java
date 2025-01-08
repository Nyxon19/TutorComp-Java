import java.util.Scanner;

public class DayNine {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 7};
        int c = 0;
        for(int b = 0; b<a.length; b++){
            c = c +a[b];
        }
        System.out.println(c);

        int[] d = {1, 2, 3, 4, 5};
        int[] e = {6, 7, 8, 9, 10};
        int[] g = new int[10];

        for(int f = 0; f<5; f++){
            g[f] = d[f];
            g[f+5] = e[f];
        }
        for(int h = 0; h<10; h++){
            System.out.println(g[h]);
        }

        Scanner sc = new Scanner(System.in);

        int[] j = new int[5];
        int[] k = new int[5];
        int l = 0;
        System.out.println("Enter the terms of the array.");
        for(int i = 0; i<5; i++){
            j[i] = sc.nextInt();
            if(j[i]!=0){
                k[l] = j[i];
                l++;
            }
        }

        for(int m = 0; m<k.length; m++){
            System.out.println(k[m]);
        }

        
        
    }
}
