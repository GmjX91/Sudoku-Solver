public class SudokuSolver {

    // Size of the board
    private static final int SIZE = 9;

    public static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == 0) { // Empty cell
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;

                            if (solveSudoku(board)) {
                                return true;
                            }

                            // Backtrack
                            board[row][col] = 0;
                        }
                    }
                    return false; // No valid number found
                }
            }
        }
        return true; // Solved!
    }

    // Check if placing num at board[row][col] is valid
    private static boolean isValid(int[][] board, int row, int col, int num) {
        for (int i = 0; i < SIZE; i++) {
            // Check row and column
            if (board[row][i] == num || board[i][col] == num) return false;
        }

        // Check 3x3 grid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[startRow + r][startCol + c] == num) return false;
            }
        }

        return true;
    }

    // Utility: Print the board
    public static void printBoard(int[][] board) {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }
