package org.toubou.Lesson22;

public class DoublyLinkList<T> {
	 // private classes should be at the end of the file
    private static class Node<T> {
        private T data;
        private Node next;
        private Node prev;

        public Node(T data) {
            this.data = data;
        }

        // no need for this method
        public void displayNode() {
            System.out.print(data + " ");
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    // both should be private, nobody outside should see the node class
    public Node first = null;
    public Node last = null;

    public void addFirst(T data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            newNode.next = null; // no need for this line, it is null by default
            newNode.prev = null; // no need for this line, it is null by default
            first = newNode;
            last = newNode;

        } else {
            first.prev = newNode;
            newNode.next = first;
            newNode.prev = null; // no need for this line, it is null by default
            first = newNode;
        }
    }

    // what about an addLast method?

    public boolean isEmpty() {
        return (first == null); // no need for parenthesis
    }

    // no need for this method (use toString)
    public void displayList() {
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    // it is helpful for remove to return the element removed
    public void removeFirst() {
        // if (isEmpty()) {
        //     throw new NoSuchElementException();
        // }
        // ...
        if (!isEmpty()) {
            Node temp = first;

            if (first.next == null) {
                first = null;
                last = null;
            } else {
                first = first.next;
                first.prev = null;
            }
            // should not really be printing in these methods
            System.out.println(temp.toString() + " is popped from the list"); // ...was removed from...
        }
    }

    // it is helpful for remove to return the element removed
    public void removeLast() {
        // if (isEmpty()) {
        //     throw new NoSuchElementException();
        // }
        // ...
        Node temp = last;

        if (!isEmpty()) {

            if (first.next == null) {
                first = null;
                last = null;
            } else {
                last = last.prev;
                last.next = null;
            }
        }
        // should not really be printing in these methods
        System.out.println(temp.toString() + " is popped from the list"); // ...was removed from...
    }
}
