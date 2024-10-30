import java.util.Arrays;
import java.util.Scanner;

public class MyBubble {
    public static void BubbleSort(int[] myArray) {
        for (int b = 0; b < myArray.length - 1; b++) {
            for (int c = 0; c < myArray.length - b - 1; c++) {
                if (myArray[c] > myArray[c + 1]) {
                    int temp = myArray[c];
                    myArray[c] = myArray[c + 1];
                    myArray[c + 1] = temp;
                }
            }
        }
    }
	public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        int size = Arnab.nextInt();
        int[] Arr = new int[size];
        for (int a = 0; a < size; a++) {
            Arr[a] = Arnab.nextInt();
        }
        BubbleSort(Arr);
        System.out.println(Arrays.toString(Arr));
    }


}