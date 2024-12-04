/*
 InputCopy
6
bit set
cat dog
hot dog
uwu owo
cat cat
zzz zzz
OutputCopy
sit bet
dat cog
dot hog
owu uwo
cat cat
zzz zzz
 */
import java.util.Scanner;
public class ACreatingWords{
    public void mySwap107(Scanner Arnab){
        String A1= Arnab.next();
        String B1= Arnab.next();
        System.out.print(B1.charAt(0)+A1.substring(1)+" "+A1.charAt(0)+B1.substring(1)+"\n" );
    }
    public static void main(String [] args){
        Scanner Arnab = new Scanner(System.in);
        ACreatingWords Object = new ACreatingWords();
        int testCount = Arnab.nextInt();
        do { 
            Object.mySwap107(Arnab);
        } while (testCount-->1);
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