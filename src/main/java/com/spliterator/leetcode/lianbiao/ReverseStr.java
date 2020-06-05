package com.spliterator.leetcode.lianbiao;

import java.util.LinkedHashMap;

/**
 * @author Chunlei.L
 * @date 2020/06/05
 *
 *
 *
 */
public class ReverseStr {

    public static void main(String[] args) {
        new LinkedHashMap<>(2);
    }

    static class Node {
        Node next;
        String value;

        Node(){}
        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                "next=" + next +
                ", value='" + value + '\'' +
                '}';
        }
    }

}
