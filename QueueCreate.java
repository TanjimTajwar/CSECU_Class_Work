
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueCreate {
    public static void main(String [] args){
        Queue<Integer> Ok = new LinkedList<>();
        Ok.add(1);
        Ok.add(10);
        Ok.add(100);
        Ok.add(1000);
        Ok.add(10000);
        Ok.add(100000);
        System.out.println("Queue:" + Ok);
        Ok.poll();
        System.out.println("Queue:" + Ok);

        Stack<Integer> Tan = new Stack<>();
        Tan.push(9);
        Tan.push(90);
        Tan.push(900);
        Tan.push(9000);
        Tan.push(90000);
        Tan.push(944444);
        System.out.println("Stack:" + Tan);
        Tan.pop();
        System.out.println("Stack:" + Tan);
    }
}
