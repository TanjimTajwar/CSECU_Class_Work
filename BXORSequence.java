
import java.util.Scanner;
/*
 InputCopy
4
0 1
12 4
57 37
316560849 14570961
OutputCopy
1
8
4
33554432
 */
public class BXORSequence{
    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        int test = Arnab.nextInt();
        do { 
            long a= Arnab.nextLong();
            long b= Arnab.nextLong();
            System.out.println(isLongestCommonSubsegment(a,b));
        } while (test-->1);
        Arnab.close();
    }
public static long isLongestCommonSubsegment(long x,long y){
    long ans = x^y;
    long count =0;
    while((ans & 1)==0){
        ans=ans>>1;
        count++;
    }
    return 1L<<count;
}
}
