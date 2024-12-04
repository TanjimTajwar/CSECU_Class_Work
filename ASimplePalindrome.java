/*
 InputCopy
3
2
3
6
OutputCopy
uo
iae
oeiiua
 */
import java.util.Scanner;

public class ASimplePalindrome {
        public static void main(String[] args) {
            Scanner Arnab = new Scanner(System.in); 
            int testCount = Arnab.nextInt(); 
            String vowels = "ouaei";  
    
            while (testCount-- > 0) {  
                int num = Arnab.nextInt(); 
    
                
                for (int i = 0; i < 5; i++) {
                    int repeat = num / 5; 
                    
                    
                    if (i < num % 5) {
                        repeat++;
                    }
    
                    
                    System.out.print(String.valueOf(vowels.charAt(i)).repeat(repeat));
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