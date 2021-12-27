package com.jeffrey.zConvert;

/**
 *
 * rowNum 增加到 num-1的时候，开始减，等于0的时候，开始增
 * colNum 如果在rowNum增加的时候，colNum不变，减的时候，colNum+1
 *
 * 最后遍历距阵，输出不等于null
 */
class Solution {
    public String convert(String str, int numRows) {

        if (str.length() <= numRows) {
            return str;
        }

        if (numRows == 1) {
            return str;
        }

        char[] arrs = str.toCharArray();

        Character[][] matrix = new Character[numRows][arrs.length];
        int row = 0;
        int col = 0;
        int magic = 1;
        for (int i = 0; i < arrs.length; i++) {
            matrix[row][col] = arrs[i];
            if (row == 0) {
                magic = 1;
            } else if (row == numRows - 1) {
                magic = -1;
            }
            row = row + magic;
            col = magic > 0 ? col : col + 1;
        }


        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < numRows; j++) {
            for (int k = 0; k < arrs.length; k++) {
                Character c = matrix[j][k];
                if (c != null) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}