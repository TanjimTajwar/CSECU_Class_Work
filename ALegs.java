package CodeForces;

import java.util.Scanner;

public class ALegs {
    public static void main(String args[]) {
        Scanner Jara = new Scanner(System.in);
        int test = Jara.nextInt();
        while (test-- > 0) {
            int legs = Jara.nextInt();
            if (legs % 4 == 0) {
                System.out.println(legs / 4);
            } else {
                System.out.println((legs / 4) + 1);
            }
        }
        Jara.close();
    }
}
