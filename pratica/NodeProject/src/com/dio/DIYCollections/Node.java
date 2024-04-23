package com.dio.DIYCollections;

public class Node<T> {
    private Node<T> next;
    private T value;
    public Node(T value) {
        this.value = value;
        this.next = null;
    }


    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                '}';
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
