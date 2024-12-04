/*
 InputCopy
6
5 2
3 5
16 4
100 3
6492 10
10 1
OutputCopy
2
3
1
4
21
10
 */

import java.util.Scanner;

public class AFindMinimumOperations {
    public static void isOperation() {
        Scanner Arnab = new Scanner(System.in);
        int testCount = Arnab.nextInt();

        while (testCount-- > 0) {
            int num = Arnab.nextInt(); 
            int k = Arnab.nextInt();   

            if (k == 1) {
                System.out.println(num);
                continue;
            }

            int answer = 0;

            while (num > 0) {
                if (num < k) {
                    answer += num;
                    break;
                }

                int temp = k;
                while (temp * k <= num) {
                    temp *= k;
                }

                num -= temp;
                answer++;
            }

            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        isOperation();
    }
}
