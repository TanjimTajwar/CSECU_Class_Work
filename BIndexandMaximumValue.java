/*
InputCopy
5
5 5
1 2 3 2 1
+ 1 3
- 2 3
+ 1 2
+ 2 4
- 6 8
5 5
1 3 3 4 5
+ 1 4
+ 2 3
- 4 5
- 3 3
- 2 6
5 5
1 1 1 1 1
+ 2 3
- 4 5
+ 1 6
- 2 5
+ 1 8
1 1
1
- 1 1
1 1
1000000000
+ 1000000000 1000000000
OutputCopy
4 4 4 5 5
5 5 4 4 3
1 1 2 1 2
0
1000000001
*/
import java.util.Scanner;

public class BIndexandMaximumValue {
    
    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        
        int test = Arnab.nextInt();
        while (test-- > 0) {
            int arrSize = Arnab.nextInt();
            int opNum = Arnab.nextInt();
            
            long[] tarry = new long[arrSize];
            long maxi = Long.MIN_VALUE;
            
            
            for (int a = 0; a < arrSize; a++) {
                tarry[a] = Arnab.nextLong();
                if (tarry[a] > maxi) {
                    maxi = tarry[a];
                }
            }
            
            
            for (int b = 0; b < opNum; b++) {
                char c = Arnab.next().charAt(0);
                long l = Arnab.nextLong();
                long r = Arnab.nextLong();
                
                
                if (l <= maxi && maxi <= r) {
                    if (c == '+') {
                        maxi++;
                    } else if (c == '-') {
                        maxi--;
                    }
                }
                
                System.out.print(maxi + " ");
            }
            System.out.println();
        }
        
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
 /* Apologies, I resolved the issue on my own, 
but encountered a Time Limit Exceeded error.
So,I reached out to ChatGPT for assistance to optimize my code. */