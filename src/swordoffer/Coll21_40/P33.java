package swordoffer.Coll21_40;

/**
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class P33 {
    public int GetUglyNumber_Solution(int index) {
        if(index==0){
            return 0;
        }
        int[] result = new int[index];
        result[0] = 1;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        int count = 0;
        while (count < index-1){
            int temp = getMin(result[i2]*2, result[i3]*3, result[i5]*5);
            if(temp == result[i2]*2)
                i2++;
            if(temp == result[i3]*3)
                i3++;
            if(temp == result[i5]*5)
                i5++;
            result[++count] = temp;
        }
        return result[index-1];

    }

    private int getMin(int i, int i1, int i2) {
        return i<i1 ? (i<i2 ? i: i2) : (i1<i2 ? i1 : i2);

    }

//    private static boolean isUgly(int num){
//        if(num < 1)
//            return false;
//        if(num == 1)
//            return true;
//        while (num % 2 == 0){
//            num /= 2;
//        }
//        while (num % 3 == 0){
//            num /= 3;
//        }
//        while (num % 5 == 0){
//            num /= 5;
//        }
//        return num == 1;
//    }

    public static void main(String[] args) {
        System.out.println(new P33().GetUglyNumber_Solution(6));
    }
}
