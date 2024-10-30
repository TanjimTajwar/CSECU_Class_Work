


/*
Input
4
2 2
7 2
5 3
1000000000 1000000000
Output
1
5
1
347369930
*/
import java.util.*;
public class KleeSUPERUPERLARGEArray {
    public static int FindSum(Scanner Arnab){
        int ArraySize = Arnab.nextInt();
        int Start = Arnab.nextInt();
        if(ArraySize==2){
            return 1;
        }
        int sum=0;
        int[] Jarry = new int[ArraySize];
        for(int a=0;a<ArraySize;a++){
            Jarry[0]=Start;
            Start++;
        }
        if(ArraySize%2==0){
            for(int b=0;b<ArraySize;b++){
                if(b<=(ArraySize/2)+1){
                    sum=sum+Jarry[b];
                }
                else{
                    sum=sum-Jarry[b];
                }
            }
        }
       else{
            for(int b=0;b<ArraySize;b++){
                if(b<=((ArraySize+1)/2)+1){
                    sum=sum+Jarry[b];
                }
                else{
                    sum=sum-Jarry[b];
                }
            }
        }
        return  Math.abs(sum);
    }
    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        int test = Arnab.nextInt();
        while(test-->0){
            System.out.println(FindSum(Arnab));
        }
        Arnab.close();
    }
}
