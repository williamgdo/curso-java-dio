package com.dio.DIYCollections;
public class Queue<T>{
    private Node<T> dummyHead;

    public Queue(T head) {
        dummyHead = new Node<>(null);
        dummyHead.setNext(new Node<>(head));
    }

    public Queue() {
        dummyHead = new Node<>(null);
        dummyHead.setNext(null);
    }

    public T peek() {
        return dummyHead.getNext().getValue();
    }

    public void enqueue(T value) {
        Node<T> aux = dummyHead;
        while (aux.getNext() != null) {
            aux = aux.getNext();
        }

        Node<T> newNode = new Node<>(value);
        aux.setNext(newNode);
    }

    public T dequeue() {
        Node<T> aux = dummyHead.getNext();
        dummyHead.setNext(dummyHead.getNext().getNext());
        return aux.getValue();
    }

    public boolean isEmpty() {
        return dummyHead.getNext() == null;
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "FILA VAZIA\n";

        String value = "FILA:\n";
        int i = 0;
        Node<T> aux = dummyHead.getNext();

        while (aux != null) {
            value += "index: " + i + ", node: " + aux.getValue() + "\n";
            aux = aux.getNext();
            i += 1;
        }
        return  value;
    }
}
