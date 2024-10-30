import java.util.Scanner;
/*
 InputCopy
3
3 3
2 4
5 3
OutputCopy
Yes
No
Yes
 */

public class ALittleNikita {
    public static void main(String [] args){
        Scanner Arnab = new Scanner(System.in);
        int test = Arnab.nextInt();
        do { 
            if(isMCube(Arnab)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        } while (--test>0);
        Arnab.close();
    }
    public static boolean isMCube(Scanner Arnab){
        int num = Arnab.nextInt();
        int m = Arnab.nextInt();
        if(num<m){
            return false;
        }
        num=num-m;
        return num%2==0;
    }
}
