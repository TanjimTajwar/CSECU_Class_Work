/*
 InputCopy
5
2
1 1
4
2 3 3 1
5
2 2 3 2 2
2
10 3
3
1 2 3
OutputCopy
2
4
5
13
5
 */
import java.util.Arrays;
import java.util.Scanner;

public class AliceAndBooks {
    public static int calculateResult(int[] Sara, int num) {
        int y = Sara[num - 1];
        Arrays.sort(Sara, 0, num - 1);
        return y + Sara[num - 2];
    }

    public static void processTestCases(Scanner Arnab, int testCount) {
        while (testCount-- > 0) {
            int num = Arnab.nextInt();
            int[] Sara = new int[num];
            for (int b = 0; b < num; b++) {
                Sara[b] = Arnab.nextInt();
            }
            System.out.println(calculateResult(Sara, num));
        }
    }

    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        int testCount = Arnab.nextInt();
        processTestCases(Arnab, testCount);
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
