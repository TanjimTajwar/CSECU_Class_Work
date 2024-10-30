import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlaceTheQueen {

    // Function to check if it's safe to place a queen at the given position
    public static boolean isSafe(int col, int row, char[][] board) {
        // Check the column
        for (int a = 0; a < board.length; a++) {
            if (board[a][row] == 'Q') {
                return false;
            }
        }
        // Check the row
        for (int a = 0; a < board.length; a++) {
            if (board[col][a] == 'Q') {
                return false;
            }
        }

        // Check upper left diagonal
        int r = row;
        for (int c = col; c >= 0 && r >= 0; r--, c--) {
            if (board[c][r] == 'Q') {
                return false;
            }
        }

        // Check lower left diagonal
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[c][r] == 'Q') {
                return false;
            }
        }

        // Check upper right diagonal
        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[c][r] == 'Q') {
                return false;
            }
        }

        // Check lower right diagonal
        r = row;
        for (int c = col; c < board.length && r < board.length; r++, c++) {
            if (board[c][r] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Function to save the board configuration
    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (int a = 0; a < board.length; a++) {
            String str = "";
            for (int b = 0; b < board[0].length; b++) {
                if (board[a][b] == 'Q') {
                    str = str + 'Q';
                } else {
                    str = str + '.';
                }
            }
            newBoard.add(str); // Fixed: Moved to the correct place outside the inner loop
        }
        allBoards.add(newBoard); // Fixed: Moved to the correct place after the outer loop
    }

    // Recursive helper function to place queens
    public static void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards); // Corrected the argument type
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(col, row, board)) { // Fixed: Added the missing `if`
                board[col][row] = 'Q'; // Place the queen
                helper(board, allBoards, col + 1); // Recur to place the next queen
                board[col][row] = '.'; // Backtrack
            }
        }
    }

    // Main function to solve the N-Queens problem
    public static List<List<String>> NQueenSolve(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n]; // Corrected to `char[][]`
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                board[a][b] = '.'; // Initialize the board with empty spaces
            }
        }
        helper(board, allBoards, 0); // Corrected the parameter types
        return allBoards;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner Arnab = new Scanner(System.in);
        System.out.print("Enter the Number of Queens: ");
        int n = Arnab.nextInt();
        List<List<String>> QueenBoard = NQueenSolve(n);

        // Displaying the boards
        for (List<String> board : QueenBoard) {
            for (String row : board) {
                System.out.println(row); // Displaying each row of the solution
            }
            System.out.println(); // Separate each solution with an empty line
        }
    }
}
