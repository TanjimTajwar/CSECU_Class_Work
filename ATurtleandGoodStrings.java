/*
  InputCopy
4
    2
     aa
    3
     aba
    4
     abcb
    12
     abcabcabcabc
OutputCopy
    No
    nO
    Yes
    YES
 */
import java.util.Scanner;

public class ATurtleandGoodStrings {
    public void Loop(Scanner Arnab){
        int test = Arnab.nextInt();
        do { 
            int StringSize = Arnab.nextInt();
            Arnab.nextLine();
            String Jim = Arnab.nextLine();
            PrintAll(StringSize, Jim);

        } while (test-- > 0);
    }

    public void PrintAll(int StringSize, String Jim){
        if(Jim.charAt(0) == Jim.charAt(StringSize - 1)){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        ATurtleandGoodStrings obj = new ATurtleandGoodStrings();
        obj.Loop(Arnab);
    }
}

/*
         ***        **    **      ** **     ***     **      ***
        ** **       **    **    **     **   ** **   **     ** **
       ** * **      ** ** **   **       **  **  **  **    ** * **
      **     **     **    **    **     **   **   ** **   **     **
     **       **    **    **      ** **     **     ***  **       **
 
*/