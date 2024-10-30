/*
 InputCopy
4
a
aaa
abb
password
OutputCopy
wa
aada
abcb
pastsword
2
 */
import java.util.Scanner;

public class AStrongPassword {
    public static void myLoop101(Scanner Arnab, int testCount){
        AStrongPassword instance = new AStrongPassword();  // Create an instance of the class
        do { 
            instance.PrintStrongPass(Arnab);  // Call the instance method using the object
        } while (testCount-- > 1);
    }

    public void PrintStrongPass(Scanner Arnab) {
        String str = Arnab.next();
        if (str.length() <= 1 && str.charAt(0) == 'a') {
            System.out.println( "b"+str);
            return;
        } else if (str.length() <= 1) {
            System.out.println("a"+str);
            return;
        }
        for (int a = 1; a < str.length(); a++) {
            if (str.charAt(a - 1) == str.charAt(a)) {
                if (str.charAt(a) == 'a') {
                    System.out.println(str.substring(0, a ) + "b" + str.substring(a));
                    return;
                } else {
                    System.out.println(str.substring(0, a ) + "a" + str.substring(a));
                    return;
                }
            }
        }
        if (str.charAt(0) == 'a') {
            System.out.println("b" + str);
        } else {
            System.out.println("a" + str);
        }
    }

    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        int testCount = Arnab.nextInt();
        myLoop101(Arnab, testCount);  // Correctly calling the static method
        Arnab.close();
    }
}
