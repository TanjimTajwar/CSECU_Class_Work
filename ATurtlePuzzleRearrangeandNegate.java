
/*
 InputCopy
8
3
-2 3 -3
1
0
2
0 1
1
-99
4
10 -2 -3 7
5
-1 -2 -3 -4 -5
6
-41 22 -69 73 -15 -50
12
1 2 3 4 5 6 7 8 9 10 11 12
OutputCopy
8
0
1
99
22
15
270
78
 */
import java.util.Scanner;

public class ATurtlePuzzleRearrangeandNegate {
    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        int t=Arnab.nextInt();
        do { 
            System.out.println(calculateTheSum(Arnab));
        } while (--t>0);
        Arnab.close();
    }
    public static int calculateTheSum(Scanner input){
        int arrSize=input.nextInt();
        int[] arr= new int[arrSize];
        int sum=0;
        for(int a=0;a<arrSize;a++){
            arr[a]=input.nextInt();
            if(arr[a]<=0){
                arr[a]=arr[a]*(-1);
                sum=sum+arr[a];
            }
            else{
                sum=sum+arr[a];
            }
        }
        return sum;
    }
}
