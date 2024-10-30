/* 
InputCopy
6
2
3
4
5
998244353
1099511627776
OutputCopy
NO
YES
NO
YES
YES
NO
*/
import java.util.Scanner;

public class AOddDivisor {
    public static void main(String[] args){
        Scanner Arnab = new Scanner(System.in);
        int test= Arnab.nextInt();
        do { 
            if(isoddDivisor(Arnab)){
                System.out.println("No");
            }
            else{
                System.out.println("YES");
            }
        } while (--test>0);
    }
    public static boolean isoddDivisor(Scanner Arnab){
        long num=Arnab.nextLong();
        return (num & num-1) ==0;
    }
}
