import java.util.Scanner;

public class JonnyTest {

    public static void main(String[] CSECU) {
        Scanner Arnab = new Scanner(System.in);
        int testCount = Arnab.nextInt(); // number of test cases
        
        while (testCount-- > 0) {
            long num = Arnab.nextLong(); // equivalent to 'n'
            long Jumps = Arnab.nextLong(); // equivalent to 'k'
            
            loopHolder(num, Jumps); // call loopHolder method to process
        }
    }

    // Method to manage the loop and call findMinOperation
    public static void loopHolder(long num, long Jumps) {
        if (Jumps > num || Jumps == 1) {
            System.out.println(num);
        } else {
            long result = findMinOperation(num, Jumps); // calculate min operations
            System.out.println(result);
        }
    }

    // Method to calculate the minimum operations to reduce 'num' using 'Jumps'
    public static long findMinOperation(long num, long Jumps) {
        long temp = num; // temporary variable to store 'num'
        long answer = 0; // count equivalent to 'ct'
        long factor = 1; // 'j' equivalent

        for (long i = 0; i < 40; i++) {
            factor *= Jumps;
            if (factor > num) {
                break;
            }
        }

        factor /= Jumps;

        while (temp != 0) {
            if (factor <= temp) {
                answer += temp / factor; // add quotient to answer
                temp = temp % factor; // reduce temp by remainder
            }
            factor /= Jumps;
        }

        return answer; // return the computed answer
    }
}
