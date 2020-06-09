package com.spliterator.leetcode.compositor;

import java.util.Arrays;

/**
 * @author Chunlei.L
 * @date 2020/06/09
 */
public class BubbleSort {

    /**
     * |3,2,5,1,4|
     * |2,3,1,4,5|
     * |2,1,3,4,5|
     * |1,2,3,4,5|
     * @param args
     */
    public static void main(String[] args) {
        int[] items = new int[]{1,2,4,6,3,5};
        int length = items.length;
        // 循环<=length-1次
        for(int i=0;i<length;i++){
            boolean flag = false;
            // 每次循环，进行数组内元素两两比较
            for(int j=0;j<length-i-1;j++){
                if(items[j]>items[j+1]){
                    int tem = items[j+1];
                    items[j+1]=items[j];
                    items[j] = tem;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
        System.out.println(Arrays.toString(items));

        //bubbleSort(items,length);
    }


    // 冒泡排序，a表示数组，n表示数组大小
    public static void bubbleSort(int[] a, int n) {
        if (n <= 1) { return; }

        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j+1]) { // 交换
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;  // 表示有数据交换
                }
            }
            if (!flag) { break; } // 没有数据交换，提前退出
        }
        System.out.println(Arrays.toString(a));
    }

}
