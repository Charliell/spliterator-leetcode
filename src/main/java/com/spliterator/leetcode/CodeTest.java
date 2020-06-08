package com.spliterator.leetcode;

import com.spliterator.leetcode.duilie.ArrayQueue;
import com.spliterator.leetcode.duilie.NodeQueue;
import com.spliterator.leetcode.zhan.ArrayStack;

/**
 * @author Chunlei.L
 * @date 2020/06/07
 */
public class CodeTest {

    public static void main(String[] args) {

        //arrayStackTest();

        //arrayQueueTest();

        //nodeQueueTest();

        System.out.println("结果:"+(1%8));


    }

    private static void nodeQueueTest() {
        NodeQueue nodeQueue = new NodeQueue(5);
        System.out.println(nodeQueue.enQueue("1","1111"));
        System.out.println(nodeQueue.enQueue("2","2222"));
        System.out.println(nodeQueue.enQueue("3","3333"));
        System.out.println(nodeQueue.enQueue("4","4444"));
        System.out.println(nodeQueue.enQueue("5","5555"));
        System.out.println(nodeQueue.enQueue("6","6666"));
        System.out.println(nodeQueue.toString());

        System.out.println(nodeQueue.deQueue());
        System.out.println(nodeQueue.deQueue());
        System.out.println(nodeQueue.deQueue());
        System.out.println(nodeQueue.deQueue());
        System.out.println(nodeQueue.deQueue());

        System.out.println(nodeQueue.toString());

    }

    private static void arrayQueueTest() {
        ArrayQueue queue = new ArrayQueue(5);
        System.out.println(queue.enqueue("h"));
        System.out.println(queue.enqueue("e"));
        System.out.println(queue.enqueue("l"));
        System.out.println(queue.enqueue("l"));
        System.out.println(queue.enqueue("o"));
        System.out.println(queue.enqueue("z"));
        System.out.println(queue.toString());

        System.out.println(queue.deququq());
        System.out.println(queue.deququq());
        System.out.println(queue.deququq());
        System.out.println(queue.deququq());
        System.out.println(queue.deququq());
        System.out.println(queue.deququq());
        System.out.println(queue.toString());

    }

    private static void arrayStackTest() {
        ArrayStack stack = new ArrayStack(5);
        stack.push("aaa");
        stack.push("bbb");
        stack.push("ccc");
        stack.push("ddd");
        stack.push("eee");
        stack.push("fff");

        System.out.println(stack.toString());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.toString());
    }

}
