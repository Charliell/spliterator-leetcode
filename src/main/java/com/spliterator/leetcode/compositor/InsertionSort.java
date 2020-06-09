package com.spliterator.leetcode.compositor;

import java.util.Arrays;

/**
 * @author Chunlei.L
 * @date 2020/06/09
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] items = new int[] {3, 5, 2, 4, 1, 6};
        int length = items.length;
        for(int i=1;i<length;++i){
            int value = items[i];
            int j = i - 1;
            for(;j>=0;--j){
                if(items[j] > value){
                    items[j+1]=items[j];
                }else{
                    break;
                }
            }
            items[j+1]=value;
        }
        System.out.println(Arrays.toString(items));
    }

}
