package swordoffer.Coll41_66;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class P42 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        HashSet<Integer> set = new HashSet<>();
        int min;
        int max;
        int ji = Integer.MAX_VALUE;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<array.length;i++){
            set.add(array[i]);
        }
        for(int i = 0; i<array.length;i++){
            if(set.contains(sum-array[i])){
                min = array[i] > (sum - array[i]) ? (sum-array[i]) : array[i];
                max = sum - min;
                if(min * max < ji){
                    result.clear();
                    result.add(min);
                    result.add(max);
                }
            }
        }
        return result;
    }
}
