package CodeForces;

import java.util.Scanner;

public class BGamewithDoors {

    public static void Arnab(int t, Scanner take){
        long ans;
        for (int a = 0; a < t; a++) {
            long l = take.nextLong();
            long r = take.nextLong();
            long L = take.nextLong();
            long R = take.nextLong();
            long c = Math.min(r, R) - Math.max(l, L);
            
            if (c < 0) {  
                System.out.println(1);
            } else {
                ans = c; 
                if (l != L) { 
                    ans += 1; 
                }
                if (r != R) { 
                    ans += 1; 
                }
                System.out.println(ans);
            }
        }
    }

    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        int test = take.nextInt();
        Arnab(test, take);
        take.close();
    }
}
