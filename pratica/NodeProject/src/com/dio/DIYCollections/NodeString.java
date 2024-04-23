package com.dio.DIYCollections;

public class NodeString {
    private NodeString next;
    private String value;
    public NodeString(String value) {
        this.value = value;
        this.next = null;
    }


    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                '}';
    }

    public NodeString getNext() {
        return next;
    }

    public void setNext(NodeString next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
