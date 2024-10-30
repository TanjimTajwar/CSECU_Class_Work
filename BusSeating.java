import java.util.*;

public class BusSeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Number of seats (and passengers)
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            boolean valid = true;
            Set<Integer> occupied = new HashSet<>();

            occupied.add(a[0]); // First passenger can sit anywhere

            for (int i = 1; i < n; i++) {
                int seat = a[i];
                // Check if seat has at least one neighbor occupied
                if (!occupied.contains(seat - 1) && !occupied.contains(seat + 1)) {
                    valid = false;
                    break;
                }
                occupied.add(seat);
            }

            if (valid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
