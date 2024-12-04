import java.util.ArrayList;
import java.util.Scanner;

public class CShowering {

    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in); 
        int testCases = Arnab.nextInt(); 

        while (testCases-- > 0) {
            int taskCount = Arnab.nextInt(); 
            int requiredShowerTime = Arnab.nextInt(); 
            int totalTimeAvailable = Arnab.nextInt(); 

            
            ArrayList<int[]> taskIntervals = new ArrayList<>();
            
            
            for (int i = 0; i < taskCount; i++) {
                int startTime = Arnab.nextInt();
                int endTime = Arnab.nextInt();
                taskIntervals.add(new int[]{startTime, endTime});
            }

            
            if (canTakeShower(taskCount, requiredShowerTime, totalTimeAvailable, taskIntervals)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    
    public static boolean canTakeShower(int taskCount, int requiredShowerTime, int totalTimeAvailable, ArrayList<int[]> taskIntervals) {
        
        if (taskIntervals.get(0)[0] >= requiredShowerTime) {
            return true;
        }

        for (int i = 1; i < taskCount; i++) {
            int previousEndTime = taskIntervals.get(i - 1)[1];
            int currentStartTime = taskIntervals.get(i)[0];

            if (currentStartTime - previousEndTime >= requiredShowerTime) {
                return true;
            }
        }
        int lastEndTime = taskIntervals.get(taskCount - 1)[1];
        return totalTimeAvailable - lastEndTime >= requiredShowerTime;
    }
}
