package swordoffer.Coll41_66;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class P50 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        HashSet<Integer> set1 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<length;i++){
            if(set1.contains(numbers[i])){
                list.add(numbers[i]);
            }else {
                set1.add(numbers[i]);
            }
        }
        int size = list.size();
        if(size <= 0){
            duplication[0] = -1;
        }else {
            int k = new Random().nextInt(size);
            duplication[0] = list.get(k);
        }

        return size > 0 ? true : false;

    }

}
