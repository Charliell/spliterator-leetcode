package com.spliterator.leetcode.duilie;

import java.util.Arrays;

/**
 * @author Chunlei.L
 * @date 2020/06/08
 */
public class ArrayQueue {

    private String[] queue;
    private int capacity;
    private int head;
    private int tail;

    public ArrayQueue(int cap){
        this.capacity=cap;
        this.queue=new String[cap];
        this.head=0;
        this.tail=0;
    }

    public boolean enqueue(String s){
        if(s == null){return false;}
        // 尾指针=容量，无法入队操作
        if(capacity==tail){
            // 队列已满
            if(head==0){ return false; }
            // 搬移数据|-,-,-,1,2| ---> |1,2,-,-,-|
            // 把头指针的值赋给中间变量i，然后搬移数据
            for(int i=head;i<tail;i++){
                queue[i-head]=queue[i];
            }
            // 搬移数据后初始化，头指针(head)和尾指针(tail)
            tail -= head;
            head = 0;
        }
        queue[tail]=s;
        ++tail;
        return true;
    }

    public String deququq(){
        if(head==tail){return null;}
        String hea = queue[head];
        ++head;
        return hea;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
            "queue=" + Arrays.toString(queue) +
            ", capacity=" + capacity +
            ", head=" + head +
            ", tail=" + tail +
            '}';
    }
}
