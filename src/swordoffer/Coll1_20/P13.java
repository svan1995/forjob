package swordoffer.Coll1_20;

import java.util.ArrayList;
import java.util.List;


/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class P13 {
    public void reOrderArray(int [] array) {
        List<Integer> leftList = new ArrayList<Integer>();
        List<Integer> rightList = new ArrayList<Integer>();
        for(int i = 0; i<array.length; i++) {
            if(array[i] % 2 == 0) {
                rightList.add(array[i]);
            }
            else {
                leftList.add(array[i]);
            }
        }
        for(int i=0;i<leftList.size();i++) {
            array[i] = leftList.get(i);
        }
        for(int i=0;i<rightList.size();i++) {
            array[leftList.size()+i] = rightList.get(i);
        }
    }
}
