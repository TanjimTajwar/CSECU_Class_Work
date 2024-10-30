/*
Problem link: https://codeforces.com/contest/2010/problem/A
InputCopy
4
4
1 2 3 17
1
100
2
100 100
5
3 1 4 1 5
OutputCopy
-15
100
0
10
*/
import java.util.Scanner;
public class AAlternatingSumofNumbers {
    public void myLoop(int testcount,Scanner Arnab){
        do { 
            int size= Arnab.nextInt();
            int[] tarry = new int[size];
            for(int a=0;a<size;a++){
                tarry[a]= Arnab.nextInt();
            }
            myOutput(size,tarry);
        } while (testcount-->1);
    }
    public void myOutput(int size,int[] tarry){
        int sum=tarry[0];
        for(int b=1;b<size;b++){
            if(b%2==0){
                sum=sum+tarry[b];
            }
            else{
                sum=sum-tarry[b];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner Arnab= new Scanner(System.in);
        int testcount= Arnab.nextInt();
        AAlternatingSumofNumbers Tim = new AAlternatingSumofNumbers();
        Tim.myLoop(testcount,Arnab);
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