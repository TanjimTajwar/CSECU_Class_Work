import java.util.Scanner;

public class ADiagonals {
    public static int Gim(Scanner tt) {
        int n = tt.nextInt();
        int k = tt.nextInt();
        if (k == 0) {
            return 0;
        } else if (n >= k) {
            return 1;
        } else {
            int p = n;
            int count = 0;
            for (int i = n - 1; i > 0; --i) {
                p += i;
                if (k <= p) {
                    ++count;
                    break;
                }
                ++count;
                p += i;
                if (k <= p) {
                    ++count;
                    break;
                }
                ++count;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner tt = new Scanner(System.in);
        int test = tt.nextInt();
        while (test-- > 0) {  
            int Ans = Gim(tt);
            System.out.println(Ans);
        }
        tt.close();
    }
}
