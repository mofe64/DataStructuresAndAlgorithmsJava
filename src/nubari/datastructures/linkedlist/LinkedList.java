package nubari.datastructures.linkedlist;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    private int length;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void append(T data) {
        if (head == null) {
            head = new Node<>(data);
            tail = head;
            return;
        }
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node<>(data);
    }
}
