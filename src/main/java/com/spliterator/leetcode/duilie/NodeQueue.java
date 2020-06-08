package com.spliterator.leetcode.duilie;

/**
 * @author Chunlei.L
 * @date 2020/06/08
 */
public class NodeQueue {

    private int capacity;
    private int size = 0;
    private Node head = null;
    private Node tail = null;


    public NodeQueue(int cap){
        this.capacity=cap;
    }

    public boolean enQueue(String k,String v){
        if(capacity<=size){
            return false;
        }
        Node node = Node.newNode();
        node.key=k;
        node.value=v;

        if(head==null&&tail==null){
            head=node;
            tail=node;
            ++size;
        }else{
            tail.next=node;
            tail=node;
            ++size;
        }
        return true;
    }

    public Node deQueue(){
        if(size==0){
            return Node.newNode();
        }

        Node nextHead = head.next;
        if(nextHead==null){
            tail=null;
        }
        Node r = head;
        head = nextHead;
        --size;
        return r;
    }

    @Override
    public String toString() {
        return "NodeQueue{" +
            "capacity=" + capacity +
            ", size=" + size +
            ", head=" + head +
            ", tail=" + tail +
            '}';
    }
}

class Node{
    Node next;
    String key;
    String value;

    static Node newNode(){
        return new Node();
    }

    @Override
    public String toString() {
        return "Node{" +
            "key='" + key + '\'' +
            ", value='" + value + '\'' +
            '}';
    }

}
