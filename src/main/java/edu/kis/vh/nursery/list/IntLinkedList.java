package edu.kis.vh.nursery.list;
public class IntLinkedList {
    private static final int Return_if_empty  = -1;
    private Node last;
    private int i;
    // TODO: delete 'i' field, never used
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }
    public boolean isEmpty() {
        return last == null;
    }
    public boolean isFull() {
        return false;
    }
    // TODO: method unused, returns false without checking any condition, either to be removed or properly implemented
    public int top() {
        if (isEmpty())
            return Return_if_empty;
        return last.getValue();
    }
    public int pop() {
        if (isEmpty())
            return Return_if_empty;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    private class Node {

        private final int value;
        private Node prev;
        private Node next;

        public Node(int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}