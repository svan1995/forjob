package graph;

import java.util.LinkedList;

public class Bfs {
    static int[][] graph =
            new int[][]{{0, 0, 1, 1, 0, 0},
                    {0, 0, 1, 0, 0, 0},
                    {1, 1, 0, 0, 0, 0},
                    {0, 0, 1, 0, 1, 0},
                    {0, 0, 0, 1, 0, 1},
                    {0, 0, 0, 0, 1, 0}};
    static int[] help = new int[graph.length];//用来记录已经遍历过的元素

    static LinkedList<Integer> queue = new LinkedList<>();

    public static void bfs(int[][] graph){
        queue.addFirst(0);
        while (!queue.isEmpty()){
            Integer i = queue.removeFirst();
            help[i] = 1;
            System.out.println(i);
            for (int j=0; j<graph[i].length; j++){
                if (graph[i][j] == 1 && help[j] == 0){
                    queue.addLast(j);
                }
            }
        }
    }

    public static void main(String[] args) {
        bfs(graph);
    }
}
