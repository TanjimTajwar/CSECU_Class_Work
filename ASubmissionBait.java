package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class ASubmissionBait {
    
    public static String Strategy(int[] array, int n) {
        Arrays.sort(array);
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
        
        int mx = 0;
        boolean aliceTurn = true;
        
        for (int i = 0; i < n; i++) {
            if (array[i] >= mx) {
                mx = array[i];
                array[i] = 0;
                aliceTurn = !aliceTurn;
            }
        }
        return aliceTurn ? "NO" : "YES";
    }

    public static void main(String[] args) {
        Scanner Tim = new Scanner(System.in);
        int test = Tim.nextInt();

        for (int a = 0; a < test; a++) {
            int n = Tim.nextInt();
            int[] array = new int[n];
            
            for (int i = 0; i < n; i++) {
                array[i] = Tim.nextInt();
            }
            
            String result = Strategy(array, n);
            System.out.println(result);
        }

        Tim.close();
    }
}
