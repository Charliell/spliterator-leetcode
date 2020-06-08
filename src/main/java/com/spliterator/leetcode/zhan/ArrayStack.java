package com.spliterator.leetcode.zhan;

import java.util.Arrays;

/**
 * @author Chunlei.L
 * @date 2020/06/07
 */
public class ArrayStack {
    // 存储空间
    private String[] items;
    // 指针
    private int index;
    // 容量
    private int capacity;

    public ArrayStack(int size){
        capacity = size;
        items = new String[size];
        index = 0;
    }

    public boolean push(String item){
        if(null==item){return false;}
        if(index >= capacity){return false;}
        items[index] = item;
        ++index;
        return true;
    }

    public String pop(){
        if(index == 0){return null;}
        --index;
        return items[index];
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
            "items=" + Arrays.toString(items) +
            ", index=" + index +
            ", capacity=" + capacity +
            '}';
    }
}
