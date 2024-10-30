/*
Problem Link: https://codeforces.com/contest/1725/problem/B
InputCopy
6 180
90 80 70 60 50 100
OutputCopy
2
*/
import java.util.Arrays;  // Import Arrays class for sorting
import java.util.Scanner; // Import Scanner class for input

public class BBasketballTogether {
    public static void main(String[] args) {
        // Create a Scanner object named Arnab for reading input
        Scanner Arnab = new Scanner(System.in);
        
        // Read the number of players and the power of the opponent team
        long players = Arnab.nextLong();   // Total number of players
        long Opponent = Arnab.nextLong();  // Power of the opponent team
        
        // Initialize the array to store the power of each player
        long[] PakChanek = new long[(int) players];
        
        // Read the power of each player from input
        for (int a = 0; a < players; a++) {
            PakChanek[a] = Arnab.nextLong();  // Store each player's power in the array
        }
        
        // Sort the array in ascending order
        Arrays.sort(PakChanek);
        
        // Reverse the sorted array to get descending order
        for (int a = 0; a < players / 2; a++) {
            long temp = PakChanek[a];  // Temporary variable for swapping
            PakChanek[a] = PakChanek[(int) players - a - 1];  // Swap with corresponding element from end
            PakChanek[(int) players - a - 1] = temp;  // Complete the swap
        }
        
        // Initialize the variable to track the number of teams that can win
        long ans = 0;
        
        // Initialize a variable to track the number of available players
        long tempPlayers = players;
        
        // Iterate through the array to form teams
        for (int a = 0; a < players; a++) {
            // Calculate the minimum number of players needed to exceed the opponent's power
            long c = (Opponent / PakChanek[a]) + 1;
            
            // Check if there are enough players left to form a team
            if (c <= tempPlayers) {
                ans++;  // Increment the count of winning teams
                tempPlayers -= c;  // Reduce the number of available players
            } else {
                break;  // Exit the loop if not enough players are available
            }
        }
        
        // Print the number of winning teams
        System.out.println(ans);
        
        // Close the Scanner object to free resources
        Arnab.close();
    }
}

/*
 ***************        *****        ****       ***   ************  ************   ***          ***
 ***************       *******       ******     ***   ************  ************   *****      *****
      ****            ***   ***      *** ***    ***            ***      ****       ******    ******
      ****           ***     ***     ***  ***   ***            ***      ****       *** ***  *** ***
      ****          *************    ***   ***  ***            ***      ****       ***  ******  ***
      ****         ***         ***   ***    *** ***   ***      ***      ****       ***          ***
      ****        ***           ***  ***     ******    ***    ***   ************   ***          ***
      ****       ***             *** ***       ****     ********    ************   ***          ***
 */
