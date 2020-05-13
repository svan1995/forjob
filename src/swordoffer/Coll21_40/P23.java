package swordoffer.Coll21_40;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class P23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 1) {
            return true;
        }
        else if (sequence.length == 0) {
            return false;
        }
        else {

            for(int i=0; i<sequence.length;i++) {
                if(sequence[i] > sequence[sequence.length-1]) {

                    int[] left = new int[i];
                    for(int j=0; j<left.length;j++) {
                        left[j] = sequence[j];
                    }
                    int[] right = new int[sequence.length -1 - i];
                    for(int j=0; j<right.length;j++) {
                        right[j] = sequence[j+i];
                        if(right[j]<sequence[sequence.length-1]) {
                            return false;
                        }
                    }
                    if(left.length == 0) {
                        return VerifySquenceOfBST(right);
                    }
                    return VerifySquenceOfBST(left) && VerifySquenceOfBST(right);
                }

            }
            int[] left = new int[sequence.length - 1];
            for(int j=0; j<left.length;j++) {
                left[j] = sequence[j];
            }
            return VerifySquenceOfBST(left);

        }
    }
}
