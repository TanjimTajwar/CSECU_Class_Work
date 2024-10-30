import java.util.ArrayList;
import java.util.Scanner;
public class AClosesPoint {
       
        public static void ClosePointCal(int T, Scanner sc) {
            while (T-- > 0) {
                int z = sc.nextInt(); 
                ArrayList<Integer> aList = new ArrayList<>(z);
    
                for (int a = 0; a < z; a++) {
                    aList.add(sc.nextInt());
                }
    
                
                if (z == 2 && aList.get(1) - aList.get(0) > 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            ClosePointCal(T, sc);
            sc.close();
        }
     }
    
