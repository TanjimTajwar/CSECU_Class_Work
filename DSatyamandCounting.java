/*
 * InputCopy
3
5
1 0
1 1
3 0
5 0
2 1
3
0 0
1 0
3 0
9
1 0
2 0
3 0
4 0
5 0
2 1
7 1
8 1
9 1
OutputCopy
4
0
8
 */
import java.util.Scanner;

public class DSatyamandCounting {
    public static int Digun(Scanner Arnab){
        int n = Arnab.nextInt();
        int sum=0;
        for(int a=0;a<n;a++){
            int x= Arnab.nextInt();
            int y = Arnab.nextInt();
            sum=sum+y;
        }
        return sum*2;
    }
    public static void main (String [] args){
        Scanner Arnab = new Scanner(System.in);

        int test = Arnab.nextInt();
        do { 
            System.out.println(Digun(Arnab));
            Digun(Arnab);
        } while (test-->1);
        Arnab.close();
    }
}
