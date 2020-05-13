package graph;

public class Prim {
    static int MAX_WEIGHT = Integer.MAX_VALUE;
    static int[][] graph = new int[][]{
            {0, 1, 5, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT},
            {1, 0, 3, 7, 5, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT},
            {5, 3, 0, MAX_WEIGHT, 1, 7, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT},
            {MAX_WEIGHT, 7, MAX_WEIGHT, 0, 2, MAX_WEIGHT, 3, MAX_WEIGHT, MAX_WEIGHT},
            {MAX_WEIGHT, 5, 1, 2, 0, 3, 6, 9, MAX_WEIGHT},
            {MAX_WEIGHT, MAX_WEIGHT, 7, MAX_WEIGHT, 3, 0, MAX_WEIGHT, 5, MAX_WEIGHT},
            {MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 3, 6, MAX_WEIGHT, 0, 2, 7},
            {MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 9, 5, 2, 0, 4},
            {MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 5, 4, 0}
    };

    public static void primTree(int[][] graph){
        int[] lowcost = new int[graph.length];
        int sum = 0;
        System.arraycopy(graph[0], 0, lowcost, 0, graph.length);
        for (int i=1; i<graph.length; i++){
            int min = -1;
            int minValue = MAX_WEIGHT;
            for (int j=1; j<graph.length; j++){
                if (lowcost[j] > 0 && lowcost[j] < minValue){
                    min = j;
                    minValue = lowcost[j];
                }
            }
            System.out.println("加入了V" + min + "节点， 加入权值" + minValue);
            sum += minValue;
            lowcost[min] = 0;
            // 将存放最小权值的数组与下一个节点的所有连接点对比，找出最小权值
            for (int j=1; j<graph.length; j++){
                if (graph[min][j] < lowcost[j]){
                    lowcost[j] = graph[min][j];
                }
            }
        }
        System.out.println("总权值为"+sum);
    }

    public static void main(String[] args) {
        primTree(graph);
    }
}
