package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class BFSMaze {
    public static void main(String[] args) {
        int[][] tab = {
                {0, 1, 0, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0}
        };

        Point s = new Point(0,0);
        Point e = new Point(4,3);


        bfs(tab,s,e);

    }

    private static void bfs(int[][] tab, Point s, Point e) {
        boolean flag = false;
        int[][] sd = new int[tab.length][tab[0].length];
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        LinkedList<Point> queue = new LinkedList<>();
        queue.addLast(s);
        while (!queue.isEmpty()){
            Point p = queue.removeFirst();
            if (p.x == e.x && p.y == e.y){
                flag = true;
                break;
            }

            for (int i=0; i<4; i++){
                int newX = p.x + dx[i];
                int newY = p.y + dy[i];
                if (newX == s.x && newY == s.y)
                    continue;
                if (newX >=0 && newX < tab.length && newY >=0 && newY < tab[0].length &&
                        tab[newX][newY] == 0 && sd[newX][newY] == 0){
                    sd[newX][newY] = sd[p.x][p.y] + 1;
                    queue.addLast(new Point(newX, newY));
                }
            }
        }

        if (flag){
            System.out.println("最短路径为 "+ sd[e.x][e.y]);
            System.out.println(Arrays.deepToString(sd));
        }
        else {
            System.out.println("没有通路");
            System.out.println(Arrays.deepToString(sd));
        }

    }

    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}
