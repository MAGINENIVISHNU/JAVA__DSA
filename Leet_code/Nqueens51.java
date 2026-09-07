import java.util.*;

public class Nqueens51 {
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> allBoards = new ArrayList<>();

        char[][] board = new char[n][n];

        // Fill board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, allBoards, 0);

        return allBoards;
    }

    // Recursive function
    public void helper(char[][] board, List<List<String>> allBoards, int col) {

        // Base case
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        // Try every row in current column
        for (int row = 0; row < board.length; row++) {

            if (isSafe(board, row, col)) {

                // Place queen
                board[row][col] = 'Q';

                // Move to next column
                helper(board, allBoards, col + 1);

                // Backtracking
                board[row][col] = '.';
            }
        }
    }

    // Save answer
    public void saveBoard(char[][] board, List<List<String>> allBoards) {

        List<String> newBoard = new ArrayList<>();

        for (char[] row : board) {
            newBoard.add(new String(row));
        }

        allBoards.add(newBoard);
    }

    // Check whether queen can be placed
    public boolean isSafe(char[][] board, int row, int col) {

        // Check left side row
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Lower-left diagonal
        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Nqueens51 p = new Nqueens51();

        List<List<String>> ans = p.solveNQueens(n);

        for (List<String> board : ans) {

            for (String row : board) {
                System.out.println(row);
            }

            System.out.println();
        }

        sc.close();
    }
}
