package swordoffer.Coll21_40;

import java.util.ArrayList;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
public class P40 {

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int x = 0;
        for(int i=0; i<array.length; i++){
            x = x^array[i];
        }
        int k=0;
        while(x % 2 == 0){
            k++;
            x = x>>>1;
        }

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for(int i=0; i< array.length; i++){
            if((array[i] >>> k) % 2 == 1 ){
                arrayList1.add(array[i]);
            }
            else {
                arrayList2.add(array[i]);
            }
        }

        int x1 = 0;
        for(Integer a : arrayList1){
            x1 = x1^a;
        }
        num1[0] = x1;

        int y = 0;
        for(Integer a : arrayList2){
            y = y^a;
        }
        num2[0] = y;
    }
}
