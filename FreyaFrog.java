/*
 Input
3
9 11 3
0 10 8
1000000 100000 10
Output
8
4
199999
 */
import java.util.Scanner;


public class FreyaFrog {
    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        int test = Arnab.nextInt();
        for (int a = 0; a < test; a++) {
            int x = Arnab.nextInt();
            int y = Arnab.nextInt();
            int m = 1;
            while (true) {
                int sum = m * (m + 1) / 2;
                if (sum >= Math.abs(x) + Math.abs(y) && (sum - x - y) % 2 == 0) {
                    System.out.println(m);
                    break;
                }
                m++;
            }
        }
    }
}
