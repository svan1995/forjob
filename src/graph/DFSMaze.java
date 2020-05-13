package graph;

public class DFSMaze {

    static String path = "";
    static String shortestPath = "";

    public static void main(String[] args) {

    int[][] maze = {
            {0, 0, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 0, 1, 1, 0, 1},
            {1, 0, 1, 0, 0, 1, 0, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 1, 0, 1},
            {1, 1, 0, 1, 1, 0, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 0}
    };

    int[][] maze2 = {
            {0, 0, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 0, 1, 1, 0, 1},
            {1, 0, 1, 0, 0, 1, 0, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 1, 0, 1},
            {1, 1, 0, 1, 1, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 1, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 0}
    };
    /*
     * 从矩阵的左上角位置开始搜索
     * */
    dfsMaze(0, 0, maze2);
		if (shortestPath.length() != 0)
                System.out.println("最短路线为：" + shortestPath);
        else
                System.out.println("没有找到路线！");

    }

    private static void dfsMaze(int i, int j, int[][] maze) {
        int m = maze.length;
        int n = maze[0].length;
        if (i < 0 || j<0 || i > m-1 || j > n-1)
            return;
        if (maze[i][j] == 1)
            return;
        if (i == m-1 && j == n-1){
            path = path + "(" + i + "," + j + ")";
            if(shortestPath.length() == 0 || path.length() < shortestPath.length()){
                shortestPath = path;
            }
            System.out.println("找到路线: " + path);
            return;
        }
        String temp = path;
        path = path + "(" + i + "," + j + ")" + "-";
        maze[i][j] = 1;
        dfsMaze(i+1, j, maze);
        dfsMaze(i-1, j, maze);
        dfsMaze(i, j+1, maze);
        dfsMaze(i, j-1, maze);
        maze[i][j] = 0;
        path = temp;

    }

}
