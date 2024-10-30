
import java.util.Scanner;

public class ADiverseGame{
    public static void arryin(Scanner tim){
        int n = tim.nextInt();
        int m= tim.nextInt();
        int[][] Jarif = new int[n][m];
        for(int b=0;b<n;b++){
            for(int c=0;c<n;c++){
                Jarif[b][c]= tim.nextInt();
            }
        }
    }
    public static void DiverseArray(int[][] array){
        int a= array.length;
        int b= array[0].length;
        int[][] Ans= new int[a][b];
        for(int c=0;c<a-1;c++){
            for(int d=0;d<b-1;d++){
                Ans[a][b]=Jarif[a+1][b+1];
            }
            Ans[c][b]=Jairf[c+1][0];
        }
        for(int r=0 ;r<a-1;r++){
            Ans[r][b]=Jarif[r+1][0];
        }
        ans[a][b]=Jarif[0][0];

    }
    public static printArray(int[][] array){
        int a= array.length;
        int b= array[0].length;
        for(int c=0;c<a;c++){
            for(int d=0;d<b;d++){
                System.out.print(Ans[c][d]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String [] args){
        Scanner tim = new Scanner(System.in);
        int test = tim.nextInt();
        for(int a=1;a<=test;a++){
            arryin(tim);
            DiverseArray(array);
            printArray();
        }
    }
}