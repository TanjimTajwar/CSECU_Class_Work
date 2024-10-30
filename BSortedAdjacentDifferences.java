/*
 InputCopy
    2
        6
            5 -2 4 8 6 5
        4
            8 1 4 2
OutputCopy
        5 5 4 6 8 -2
        1 2 4 8
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BSortedAdjacentDifferences {

    public void loop(int test, Scanner scanner) {
        while (test-- > 0) {
            int[] array = getArray(scanner);
            print(array.length, array);
        }
    }

    public int[] getArray(Scanner scanner) {
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        return array;
    }

    public void print(int arraySize, int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arraySize / 2; i++) {
            stack.push(array[i]);
            stack.push(array[arraySize - i - 1]);
        }
        if (arraySize % 2 != 0) {
            stack.push(array[arraySize / 2]);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        BSortedAdjacentDifferences obj = new BSortedAdjacentDifferences();
        obj.loop(test, scanner);
        scanner.close(); 
    }
}
