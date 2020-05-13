package swordoffer.Coll1_20;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */

public class P19 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int [][] temp;
        temp = matrix;
        while(temp.length >= 1) {
            for(int i=0; i<temp[0].length;i++) {
                result.add(temp[0][i]);
            }
            if(temp.length > 1) {
                temp = reverseMatrix(temp);
            }else {
                break;
            }
        }


        return result;
    }

    private int[][] reverseMatrix(int[][] temp) {
        int rows = temp.length;
        int cols = temp[0].length;
        int[][] newMatrix = new int[cols][rows-1];
        for(int i=1; i<rows;i++) {
            for(int j=0; j<cols;j++) {
                newMatrix[cols-1-j][i-1] = temp[i][j];
            }
        }
        return newMatrix;
    }
}
