public class Data {
    public static final int MAX = 500; // THIS VALUE ADDED TO ENABLE TESTING
    private int[][] grid;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public Data(int[][] g) {
        grid = g;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public int[][] getGrid() {
        return grid;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public void setGrid(int[][] newGrid) {
        grid = newGrid;
    }

    public void repopulate() {
        // TYPE UP YOUR PART A CODE HERE
        // then test with DataTester
		for (int i = 0; i < grid.length; i++) {
	        for (int j = 0; j < grid[0].length; j++) {
		        int num = (int)(Math.random() * MAX) + 1;
	            while (num % 10 != 0 || num % 100 == 0) {
                    num = (int)(Math.random() * MAX) + 1;
                }
                grid[i][j] = num;
            }
        }
    }

    public int countIncreasingCols() {
        // TYPE UP YOUR PART B CODE HERE
        // then test with DataTester
		int count = 0;
		for (int i = 0; i < grid[0].length; i++) {
			boolean isIncreasing = true;
			for (int j = 1; j < grid.length; j++) {
	if (grid[j][i] < grid[j - 1][i]) {
		isIncreasing = false;
}
}
if (isIncreasing) {
	count++;
}
}
return count;
    }
}

