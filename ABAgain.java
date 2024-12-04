package CodeForces;

import java.util.Scanner;

public class ABAgain {

    public static void main(String[] args) {
        Scanner Jonny = new Scanner(System.in);
        int test = Jonny.nextInt();
        
        Jonny.nextLine();
        
        while (test-- > 0) {
            String n = Jonny.nextLine();
            int a = n.charAt(0) - '0';
            int b = n.charAt(1) - '0'; 
            System.out.println(a + b);
        }
        
        Jonny.close();
    }
}
/*
 ***************        *****        ****       ***   ************  ************   ***          ***
 ***************       *******       ******     ***   ************  ************   *****      *****
      ****            ***   ***      *** ***    ***            ***      ****       ******    ******
      ****           ***     ***     ***  ***   ***            ***      ****       *** ***  *** ***
      ****          *************    ***   ***  ***            ***      ****       ***  ******  ***
      ****         ***         ***   ***    *** ***   ***      ***      ****       ***          ***
      ****        ***           ***  ***     ******    ***    ***   ************   ***          ***
      ****       ***             *** ***       ****     ********    ************   ***          ***
 */