package com.spliterator.leetcode.compositor;

import java.util.Arrays;

/**
 * @author Chunlei.L
 * @date 2020/06/09
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] items = new int[] {3, 5, 2, 4, 1, 6};
        int length = items.length;
        for(int i=0;i < length;i++){
            int minValue = i;
            for(int j=i+1;j<length;j++){
                if(items[j] < items[minValue]){
                    minValue=j;
                }
            }
            int tem = items[minValue];
            items[minValue] = items[i];
            items[i] = tem;
        }
        System.out.println(Arrays.toString(items));
    }

}
