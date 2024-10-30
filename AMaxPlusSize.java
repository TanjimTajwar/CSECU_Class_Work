
/*
 InputCopy
4
3
5 4 5
3
4 5 4
10
3 3 3 3 4 1 2 3 4 5
9
17 89 92 42 29 92 14 70 45
OutputCopy
7
6
10
97
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AMaxPlusSize {
    public static int MaxandSizePlus(Scanner Arnab) {
        int arraySize = Arnab.nextInt();
        int[] arr = new int[arraySize];
        for (int a = 0; a < arraySize; a++) {
            arr[a] = Arnab.nextInt();
        }
        
        Arrays.sort(arr);
        ArrayList<Integer> myList = new ArrayList<>();
        int count = 1;
        
        myList.add(arr[0]); // Add the first element
        
        for (int b = 1; b < arraySize; b++) {
            if (arr[b] != arr[b - 1]) {
                count++;
            }
            if (count % 2 != 0) {
                myList.add(arr[b]);
            }
        }
        
        if (myList.isEmpty()) {
            return 0;
        }
        
        Collections.sort(myList);
        return myList.size() + myList.get(myList.size() - 1);
    }

    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        int test = Arnab.nextInt();
        do {
            System.out.println(MaxandSizePlus(Arnab));
        } while (--test > 0);
        Arnab.close();
    }
}
