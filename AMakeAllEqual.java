
import java.util.HashMap;
import java.util.Scanner;

public class AMakeAllEqual {

    public static int frequency(Scanner Jarif){
        int size= Jarif.nextInt();
        int[] array= new int[size];
        Map<Integer,Integer> Jim = new HashMap<>();
        for(int a=0;a<size;a++){
            array[a]= Jarif.nextInt();
        }
        int maxfrequency=0;
        for(int b=0;b<size;b++){
            int current = array[b];
            int frequency= Jim.getOrDefoult(current,0)+1;
            Jim.put(current,frequency);
            maxfrequency = Math.max(maxfrequency, frequency);
        }
        int ans= size - maxfrequency;
        return ans;
    }
    public static void main(String[] args) {
        Scanner Jarif= new Scanner(System.in);
        int test= Jarif.nextInt();
        while(test-->0){
            int answer= frequency(Jarif);
            System.out.println("answer");
        }
        Jarif.close();
    }
}
