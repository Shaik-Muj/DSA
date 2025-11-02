import java.util.*;

class _02 {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        char grid[][] = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '0';
            }
        }

        for(int i=0; i<guards.length; i++){
            int x = guards[i][0], y = guards[i][1];
            grid[x][y] = 'G';
        }

        for(int i=0; i<walls.length; i++){
            int x = walls[i][0], y = walls[i][1];
            grid[x][y] = 'W';
        }

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 'G'){
                    dfs(grid, i, j);
                }
            }
        }

        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '0'){
                    count += 1;
                }
            }
        }
        return count;
    }

    static void dfs(char[][] grid, int i, int j) {
    // up
    for (int x = i - 1; x >= 0; x--) {
        if (grid[x][j] == 'W' || grid[x][j] == 'G') break;
        grid[x][j] = 'V';
    }

    // down
    for (int x = i + 1; x < grid.length; x++) {
        if (grid[x][j] == 'W' || grid[x][j] == 'G') break;
        grid[x][j] = 'V';
    }

    // left
    for (int y = j - 1; y >= 0; y--) {
        if (grid[i][y] == 'W' || grid[i][y] == 'G') break;
        grid[i][y] = 'V';
    }

    // right
    for (int y = j + 1; y < grid[0].length; y++) {
        if (grid[i][y] == 'W' || grid[i][y] == 'G') break;
        grid[i][y] = 'V';
    }
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Expected input:
		// m n
		// g
		// g lines: guardRow guardCol
		// w
		// w lines: wallRow wallCol

		int m = sc.nextInt();
		int n = sc.nextInt();

		int g = sc.nextInt();
		int[][] guards = new int[g][2];
		for (int i = 0; i < g; i++) {
			guards[i][0] = sc.nextInt();
			guards[i][1] = sc.nextInt();
		}

		int w = sc.nextInt();
		int[][] walls = new int[w][2];
		for (int i = 0; i < w; i++) {
			walls[i][0] = sc.nextInt();
			walls[i][1] = sc.nextInt();
		}

		_02 solver = new _02();
		int result = solver.countUnguarded(m, n, guards, walls);
		System.out.println(result);

		sc.close();
	}

}