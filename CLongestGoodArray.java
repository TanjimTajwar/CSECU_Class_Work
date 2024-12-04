/*
InputCopy
5
1 2
1 5
2 2
10 20
1 1000000000
OutputCopy
2
3
1
5
44721
*/
import java.util.Scanner;

public class CLongestGoodArray {
    
    public static int Beautifull(Scanner Arnab) {
        int start = Arnab.nextInt();
        int end = Arnab.nextInt();
        
        int diff = end - start;
        int count = 1;
        
        while ((count * (count - 1)) / 2 <= diff) {
            count++;
        }
        
        return count - 1;
    }

    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        
        int testCount = Arnab.nextInt();
        
        do { 
            System.out.println(Beautifull(Arnab));
        } while (--testCount > 0);
        
        Arnab.close();
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

