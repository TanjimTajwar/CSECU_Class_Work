/*
 InputCopy
6
1
ABCD
2
AAAAAAAA
2
AAAABBBB
2
????????
3
ABCABCABCABC
5
ACADC??ACAC?DCAABC?C
OutputCopy
4
2
4
0
9
13
 */
import java.util.Scanner;

public class AQuestionMarks {
    public static int findRightAns(Scanner Arnab) {
        int n = Arnab.nextInt();
        String Jim = Arnab.next();
        int rightAnswer = 0;
        int a = 0, b = 0, c = 0, d = 0;
        
        for (int j = 0; j < 4 * n; j++) {
            if (Jim.charAt(j) == 'A' && a < n) {  
                a++;
                rightAnswer++;
            } else if (Jim.charAt(j) == 'B' && b < n) {  
                b++;
                rightAnswer++;
            } else if (Jim.charAt(j) == 'C' && c < n) {  
                c++;
                rightAnswer++;
            } else if (Jim.charAt(j) == 'D' && d < n) {  
                d++;
                rightAnswer++;
            }
        }
        return rightAnswer;
    }

    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        int testCount = Arnab.nextInt();
        do {
            System.out.println(findRightAns(Arnab));
        } while (testCount-- > 1);
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