package graph;

public class Dfs {
    static int[][] graph =
            new int[][]{{0, 0, 1, 1, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {1, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0, 1},
            {0, 0, 0, 0, 1, 0}};
    static int[] help = new int[graph.length];//用来记录已经遍历过的元素

    public static void dfs(int node, int[][] graph){
        help[node] = 1;
        System.out.println(node);
        for (int i=0; i < graph[node].length; i++){
            if (graph[node][i] == 1 && help[i] == 0){
                dfs(i, graph);
            }
        }
    }

    public static void main(String[] args) {
        dfs(0, graph);
    }
}
