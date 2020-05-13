package graph;

public class ShortPath {
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
    static int[] paths = new int[graph.length];
    static boolean[] isVisited = new boolean[graph.length];

    public static void shortPath(int[][] graph){
        System.arraycopy(graph[0], 0, paths, 0, paths.length);
        isVisited[0] = true;
        for (int i=1; i<graph.length; i++){
            // 在已经存在的路径中找到一条未被访问且最短的路径
            int min = MAX_WEIGHT;
            int minIndex = -1;
            for (int j=1; j<graph.length; j++){
                if (!isVisited[j] && paths[j] < min){
                    min = paths[j];
                    minIndex = j;
                }
            }
//            if (minIndex == -1){
//                continue;
//            }
            isVisited[minIndex] = true;

            // 找到的最短路径节点的可使用边中，判断是否比已经存在的最短路径短，是则进行覆盖
            for (int k=1; k<graph.length; k++){
                if (!isVisited[k] && graph[minIndex][k] != MAX_WEIGHT && ((graph[minIndex][k] + min) < paths[k])){
                    paths[k] = graph[minIndex][k] + min;
                }
            }
        }
        for (int j=1; j<graph.length; j++){
            System.out.println("V0到V" + j + "的最短路径为：" + paths[j]);
        }
    }

    public static void main(String[] args) {
        shortPath(graph);
    }
}
