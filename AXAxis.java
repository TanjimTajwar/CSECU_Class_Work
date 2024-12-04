
/*
 InputCopy
8
1 1 1
1 5 9
8 2 8
10 9 3
2 1 1
2 4 1
7 3 5
1 9 4
OutputCopy
0
8
6
7
1
3
4
8
 */
import java.util.Scanner;

public class AXAxis {
    public void whileLoop(Scanner Arnab){
        int test = Arnab.nextInt();
        do { 
            int a = Arnab.nextInt();
            int b = Arnab.nextInt();
            int c = Arnab.nextInt();
            int Ans = MathCal(a,b,c);
            System.out.println(Ans);
        } while (test-->0);
    }
    public int MathCal(int a,int b , int c){
        int Dhaka = Math.abs(b-a)+Math.abs(c-a);
        int Khulna = Math.abs(a-b)+Math.abs(c-c);
        int Chittagong = Math.abs(a-c)+Math.abs(b-c);
        int answer = Math.min(Dhaka, Math.min(Khulna, Chittagong));
        return answer;
    }
    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        AXAxis Jim = new AXAxis();
        Jim.whileLoop(Arnab);
        Arnab.close();
    }
}
