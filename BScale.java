/*
InputCopy
    4
        4 4
         0000
         0000
         0000
         0000
        6 3
         000111
         000111
         000111
         111000
         111000
         111000
        6 2
         001100
         001100
         111111
         111111
         110000
         110000
        8 1
         11111111
         11111111
         11111111
         11111111
         11111111
         11111111
         11111111
         11111111
OutputCopy
    0
     01
     10
      010
      111
      100
11111111
11111111
11111111
11111111
11111111
11111111
11111111
11111111

*/

import java.util.Scanner;

public class BScale {
    public void loophold(Scanner Arnab) {
        int test = Arnab.nextInt();
        int i = 0;
        do {
            int n = Arnab.nextInt();
            int k = Arnab.nextInt();
            char[][] arr = new char[n][n];
            
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    arr[a][b] = Arnab.next().charAt(0);
                }
            }
            
            printAll(n, k, arr);
            i++;
        } while (i < test);
    }

    public void printAll(int n, int k, char[][] arr) {
        for (int i = 0; i < n; i += k) {
            for (int j = 0; j < n; j += k) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        BScale Obj = new BScale();
        Obj.loophold(Arnab);
    }
}
