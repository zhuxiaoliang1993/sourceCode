package com.ynet.array;

public class ReversalArray {
    public static void main(String[] args) {
        // 定义存储1 2 3 4 整数的数组
        int[] array3 = {1,2,3,4,5};
        // 定义最小数组下标
        int smallIndex = 0;
        // 定义最大数组下标
        int maxIndex = array3.length - 1;
        //
        while (smallIndex < maxIndex){
            int temp = array3[smallIndex];
            array3[smallIndex] = array3[maxIndex];
            array3[maxIndex] = temp;
            smallIndex ++;
            maxIndex --;
        }
        // 反转结束 遍历输出反转之后的数组
        for (int ary:array3
             ) {
            System.out.println(ary);
        }
    }
}
