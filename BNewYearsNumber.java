/*
 InputCopy
5
1
4041
4042
8081
8079
OutputCopy
NO
YES
YES
YES
NO
 */
import java.util.Scanner;

public class BNewYearsNumber {
    public static boolean is2020(Scanner Arnab){
        int num = Arnab.nextInt();
        for(int a=0;a<num/2020;++a){
            int g= num- 2020*a;
            if(g>=0 && g%2021==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        int test = Arnab.nextInt();
        do { 
            if(is2020(Arnab)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        } while (--test>0);
        Arnab.close();
    }
}
