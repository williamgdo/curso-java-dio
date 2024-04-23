package com.dio.DIYCollections;

public class Main {
    public static void main(String[] args) {
//        NodeString no1 = new NodeString("node 1");
//        NodeString no2 = new NodeString("node 2");
//        NodeString no3 = new NodeString("node 3");
//        NodeString no4 = new NodeString("node 4");
//
//        no1.setNext(no2);
//        no2.setNext(no3);
//        no3.setNext(no4);

        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(7);
        Node<Integer> node3 = new Node<>(13);
        node1.setNext(node2);
        node2.setNext(node3);

        Stack<Integer> stack = new Stack<>(1);
        stack.push(2);

//        System.out.println(stack.top());
        Integer removed = stack.pop();
//        System.out.println("removed: " + removed);
//        System.out.println(stack.top());

//        System.out.println(stack.isEmpty());
        removed = stack.pop();
//        System.out.println("removed: " + removed);
//        System.out.println(stack.top());

//        System.out.println(stack.isEmpty());

        Queue<Integer> q = new Queue<>(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println(q.toString());
        q.dequeue();
        System.out.println(q.toString());

        Queue<String> palavras = new Queue<>();

        palavras.enqueue("hello world");
        palavras.enqueue("my name is will");

        System.out.println(palavras.peek());

        palavras.dequeue();
        System.out.println(palavras.toString());

        palavras.dequeue();
        System.out.println(palavras.isEmpty());
    }
}
