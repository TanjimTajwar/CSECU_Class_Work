/*
 *Input
Copy

5
2
11
4
1111
9
111101111
9
111111111
12
111110011111

Output
Copy

No
Yes
Yes
No
No

 */
import java.util.Scanner;

public class BSquareorNot {
    public static void findSquire(Scanner Arnab){
        int StringSize = Arnab.nextInt();
        int rootSize= (int) Math.sqrt(StringSize);
        String Hello = Arnab.next();
        if(rootSize*rootSize!=StringSize){
            System.out.println("No");
            return;
        }
        int count=0;
        for(int a=0;a<StringSize;a++){
            if(Hello.charAt(a)=='0'){
                count++;
            }
        }
        int Zero = (rootSize-1)*(rootSize-1);
        if(count==Zero){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        int testNum = Arnab.nextInt();
        do { 
            findSquire(Arnab);
        } while (testNum-->1);
        Arnab.close();
    }
    
}
