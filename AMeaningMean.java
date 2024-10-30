import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AMeaningMean {
    public static void main(String[] CSECU) {
        Scanner Arnab = new Scanner(System.in);
        int testCount = Arnab.nextInt();
        do {
            int arrSize = Arnab.nextInt();
            List<Integer> myList1 = new ArrayList<>();
            for (int a = 0; a < arrSize; a++) {
                int num = Arnab.nextInt();
                myList1.add(num); // Fixed here
            }
            System.out.println(foundTheMax(myList1));
        } while (testCount-- > 1); 
    }

    public static int foundTheMax(List<Integer> myList1) {
        Collections.sort(myList1);
        while (myList1.size() > 1) {
            int sum = myList1.get(0) + myList1.get(1);
            int adder = sum / 2;
            myList1.add(adder); 
            myList1.remove(1); 
            myList1.remove(0); 
        }
        System.out.println(myList1);
        return myList1.get(0); 
    }
}
