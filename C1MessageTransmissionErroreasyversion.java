/*
 InputCopy
abrakadabrabrakadabra
OutputCopy
YES
abrakadabra
InputCopy
acacacaca
OutputCopy
YES
acaca
InputCopy
abcabc
OutputCopy
NO
InputCopy
abababab
OutputCopy
YES
ababab
InputCopy
tatbt
OutputCopy
NO
 */
import java.util.Scanner;

public class C1MessageTransmissionErroreasyversion {
    public static void SovaRomove(Scanner Arnab) {
        String Sova = Arnab.next();
        
        for (int b = (Sova.length() / 2) + 1; b < Sova.length(); b++) {
            String prefix = Sova.substring(0, b);
            String suffix = Sova.substring(Sova.length() - b);
            
            if (prefix.equals(suffix)) {
                System.out.println("YES");
                System.out.println(prefix);
                return;
            }
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        SovaRomove(Arnab);
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