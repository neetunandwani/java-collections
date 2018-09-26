package com.ttn.collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public void test() {
        System.out.println("implement Queue: FIFO");
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.forEach(System.out::println);

        System.out.println(queue.remove());

        System.out.println();
        System.out.println("Stack: LIFO");
        Queue stack = new LinkedList();
        ((LinkedList) stack).push("a");
        ((LinkedList) stack).push("b");
        ((LinkedList) stack).push("b");
        stack.forEach(System.out::println);
        System.out.println(((LinkedList) stack).pop());

//        System.out.println("Other methods");
//        System.out.println(((LinkedList<String>) queue).poll()); //unlink first
//        System.out.println(((LinkedList<String>) queue).peek());

    }
}
