public class Task3 {

    public static void main(String[] args) {
        int[][] grid = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        System.out.println("Original Puzzle:");
        printGrid(grid);

        if (solveSudoku(grid)) {
            System.out.println("Solved Puzzle:");
            printGrid(grid);
        } else {
            System.out.println("No solution exists.");
        }
    }

    private static void printGrid(int[][] grid) {
        for (int row = 0; row < 9; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("------+-------+------");
            }
            for (int col = 0; col < 9; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print("| ");
                }
                System.out.print(grid[row][col] == 0 ? ". " : grid[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean solveSudoku(int[][] grid) {
        int[] empty = findEmpty(grid);
        if (empty == null) {
            return true;
        }
        int row = empty[0], col = empty[1];

        for (int num = 1; num <= 9; num++) {
            if (isValid(grid, num, row, col)) {
                grid[row][col] = num;

                if (solveSudoku(grid)) {
                    return true;
                }
                grid[row][col] = 0;
            }
        }
        return false;
    }

    private static int[] findEmpty(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] == 0) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    private static boolean isValid(int[][] grid, int num, int row, int col) {
        for (int j = 0; j < 9; j++) {
            if (grid[row][j] == num) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (grid[i][col] == num) {
                return false;
            }
        }
        int boxRow = (row / 3) * 3;
        int boxCol = (col / 3) * 3;
        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (grid[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
