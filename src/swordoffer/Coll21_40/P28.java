package swordoffer.Coll21_40;

import java.util.Arrays;


/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class P28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int temp = array[(array.length-1) / 2];
        int sum = 0;
        for(int i=0;i<array.length;i++) {
            if(array[i] == temp)
                sum++;
        }
        return sum <= array.length/2 ? 0:temp;
    }

}
