package com.spliterator.leetcode.duilie;

/**
 * @author Chunlei.L
 * @date 2020/06/08
 *
 *
 * 队列满条件： (tail+1)%capatity = head
 */

public class CirculateQueue {

    private String[] items;
    private int capacity;
    private int head=0;
    private int tail=0;

    public CirculateQueue(int cap){
        this.items=new String[cap];
        this.capacity=cap;
    }

    public boolean enQueue(String s){
        if((tail+1) % capacity == head){ return false; }
        items[tail] = s;
        tail = (tail+1) % capacity;
        return true;
    }

    public String deQueue(){
        if(head == tail){ return null; }
        String item = items[head];
        head = (head+1) % capacity;
        return item;
    }

}
