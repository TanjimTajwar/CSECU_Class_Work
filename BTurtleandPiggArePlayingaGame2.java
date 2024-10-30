/*
 * InputCopy
5
2
1 2
3
1 1 2
3
1 2 3
5
3 1 2 2 3
10
10 2 5 2 7 9 2 5 10 7
OutputCopy
2
1
2
2
7
 */
import java.util.Arrays;
import java.util.Scanner;

public class BTurtleandPiggArePlayingaGame2 {
    public void myLoop(Scanner Arnab){
        int test = Arnab.nextInt();
        do { 
            int length = Arnab.nextInt();
            int[] jim = new int[length];
            for (int i = 0; i < length; i++) {
                jim[i]= Arnab.nextInt();
            }
            Arrays.sort(jim);
            if(length==2){
                System.out.println(jim[1]);
            }
            else if(length%2==0){
                System.out.println(jim[length/2]);
            }
            else{
                System.out.println(jim[(length-1)/2]);
            }
        } while (test-->0);
    }

    public static void main(String[] args) {
        BTurtleandPiggArePlayingaGame2 obj = new BTurtleandPiggArePlayingaGame2();
        Scanner Arnab = new Scanner(System.in);
        obj.myLoop(Arnab);
        Arnab.close();
    }
}
/*
         ***        **    **      ** **     ***     **      ***
        ** **       **    **    **     **   ** **   **     ** **
       ** * **      ** ** **   **       **  **  **  **    ** * **
      **     **     **    **    **     **   **   ** **   **     **
     **       **    **    **      ** **     **     ***  **       **
 
*/