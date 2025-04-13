public class Main{

  public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 4, 0},
                {0, 0, 0, 0, 1, 0, 5, 0, 0},
                {0, 4, 5, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 3, 0, 0, 0, 0, 4, 0, 0}
        };

        if (solveSudoku(board)) {
            System.out.println("Sudoku Solved:");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
  }
}
