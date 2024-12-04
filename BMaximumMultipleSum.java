/*
 InputCopy
2
3
15
OutputCopy
3
2
 */
import java.util.Scanner;

public class BMaximumMultipleSum {
    public static int findMaxi(Scanner Arnab){
        int number = Arnab.nextInt();
        if(number==3){
            return 3;
        }
        return 2;
    }
    public void myLoop108(Scanner Arnab , int testCount){
        do { 
            System.out.println(findMaxi(Arnab));P
        } while (testCount-->1);
    }
    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        int testCount = Arnab.nextInt();
        BMaximumMultipleSum Object108 = new BMaximumMultipleSum();
        Object108.myLoop108(Arnab,testCount);
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