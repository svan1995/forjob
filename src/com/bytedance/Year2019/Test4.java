package com.bytedance.Year2019;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;
        for (int i=0; i<n; i++){
            int m = scanner.nextInt();
            HashMap<Cat, Integer> map = new HashMap<>();
            ArrayList<Cat> cats = new ArrayList<>();
            for (int j=0; j<m; j++){
                int num = scanner.nextInt();
                for (int k=0; k<num; k++){
                    Cat cat= new Cat(scanner.nextInt(), scanner.nextInt());
                    if (!map.containsKey(cat)){
                        map.put(cat, 1);
                    }
                    else {
                        map.put(cat, map.get(cat) +1);
                    }
                    if (map.get(cat) > max){
                        max = map.get(cat);
                    }
                    cats.add(cat);
                }
                for (Cat cat : map.keySet()){
                    if (!cats.contains(cat)){
                        map.put(cat, 0);
                    }
                }
                cats = new ArrayList<>();
            }
            System.out.println(max);
            max = 0;
        }
        scanner.close();

    }

    static class Cat{
        private int x;
        private int y;


        public Cat(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cat cat = (Cat) o;
            return x == cat.x &&
                    y == cat.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
