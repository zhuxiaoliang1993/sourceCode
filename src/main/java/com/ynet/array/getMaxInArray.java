package com.ynet.array;

// 获取数组中的最大值
public class getMaxInArray {
    public static void main(String[] args) {
        int[] array = {8, 6, 9, 5, 10, 7, 0};
        int tempInt = array[0];
        for (int arrayTemt : array
        ) {
            if (arrayTemt > tempInt ){
                tempInt = arrayTemt;
            }
        }
        System.out.println(tempInt);
    }
}
