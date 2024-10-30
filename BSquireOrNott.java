/*
 *Input
Copy

5
2
11
4
1111
9
111101111
9
111111111
12
111110011111

Output
Copy

No
Yes
Yes
No
No

 */
import java.util.Scanner;

public class BSquireOrNott {
    public static boolean isPerfectSquare(int StringSize) {
        int rootSize = (int) Math.sqrt(StringSize);
        return rootSize * rootSize == StringSize;
    }
    public static boolean canBeSquareBeautifulMatrix(int StringSize, String Hello) {
        if (!isPerfectSquare(StringSize)) {
            return false;
        }

        int rootSize = (int) Math.sqrt(StringSize);

        for (int i = 0; i < rootSize; i++) {
            if (i == 0 || i == rootSize - 1) {
                for (int j = 0; j < rootSize; j++) {
                    if (Hello.charAt(i * rootSize + j) != '1') {
                        return false;
                    }
                }
            } else {
                if (Hello.charAt(i * rootSize) != '1' || Hello.charAt(i * rootSize + rootSize - 1) != '1') {
                    return false;
                }
                for (int j = 1; j < rootSize - 1; j++) {
                    if (Hello.charAt(i * rootSize + j) != '0') {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);

        int testNum = Arnab.nextInt();
        Arnab.nextLine();
        for (int a = 0; a < testNum; a++) {
            int StringSize = Arnab.nextInt();
            Arnab.nextLine();
            String Hello = Arnab.nextLine();

            if (canBeSquareBeautifulMatrix(StringSize, Hello)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        Arnab.close();
    }
}
