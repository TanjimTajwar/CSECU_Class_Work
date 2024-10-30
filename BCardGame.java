import java.util.Scanner;

public class BCardGame {
    public static void main(String[] args) {
        Scanner card = new Scanner(System.in);
        int test = card.nextInt();
        while (test-- > 0) {
            int a = card.nextInt();
            int b = card.nextInt();
            int A = card.nextInt();
            int B = card.nextInt();
            int count = 0;
            
            if (a > A) {
                count++;
            }
            if (a > B) {
                count++;
            }
            if (b > A) {
                count++;
            }
            if (b > B) {
                count++;
            }
            
            if (count == 3) {
                System.out.println("2");  // Special case when Player 1 wins 3 out of 4 comparisons
            } else {
                System.out.println(count); // Otherwise, output the count
            }
        }
        card.close();
    }
}
