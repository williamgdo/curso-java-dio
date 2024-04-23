package com.dio.DIYCollections;
public class Stack<T>{
    private Node<T> head;

    public Stack(T head) {
        this.head = new Node<>(head);
    }

    public Stack() {
        this.head = null;
    }

    public T top() {
        return head.getValue();
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNext(head);
        head = newNode;
    }

    public T pop() {
        Node<T> tmp = head;
        head = head.getNext();
        return tmp.getValue();
    }

    public boolean isEmpty() {
        return head == null;
    }
}
