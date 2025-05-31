package datastructures;

// Generic Singly Linked List

public class LinkedList<T> {
    private class Node {
        T value;
        Node next;

        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Returns Linked List size
    public int size() { return size; }

    // Returns a Node by index
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        if (index == size - 1) {
            return tail.value;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    // Returns first index's Node
    public T getFirst() {
        if (head == null) {
            System.out.println("Linked list is empty!");
            return null;
        }
        return head.value;
    }

    // Returns last index's Node
    public T getLast() {
        if (tail == null) {
            System.out.println("Linked list is empty!");
            return null;
        }
        return tail.value;
    }

    // Returns Node's index by Node's value
    public int search(T value) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value.equals(value)) return i;
            temp = temp.next;
        }

        return -1;
    }

    // Inserts a new Node
    public void insert(T value) {
        insertAt(0, value);
    }

    // Inserts a new Node at specific index
    public void insertAt(int index, T value) {
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds");
            return;
        }

        if (index == 0) {
            Node temp = head;
            head = new Node(value);
            head.next = temp;
            if (tail == null) tail = head;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node after = temp.next;
            temp.next = new Node(value);
            temp.next.next = after;
        }
        size++;
    }

    // Inserts a new Node at the last index
    public void insertLast(T value) {
        if (head == null && tail == null) {
            head = tail = new Node(value);
        } else {
            Node vertex = new Node(value);
            tail.next = vertex;
            tail = vertex;
        }
        size++;
    }

    // Updates a Node's value by index
    public void set(int index, T value) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }

        if (index == size - 1) {
            tail.value = value;
            return;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.value = value;
    }

    // Removes a Node by index
    public T remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return null;
        }

        T value;

        if (index == 0) {
            value = head.value;
            head = head.next;
            if (head == null) tail = null;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            value = temp.next.value;
            temp.next = temp.next.next;
            if (temp.next == null) tail = temp;
        }
        size--;
        return value;
    }

    // Removes first index's Node
    public T removeFirst() {
        if (head == null) {
            System.out.println("Linked list is empty!");
            return null;
        }

        T value = head.value;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return value;
    }

    // Removes last index's Node
    public T removeLast() {
        if (head == null) {
            System.out.println("Linked list is empty!");
            return null;
        }

        T value;

        if (head.next == null) {
            value = head.value;
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            value = temp.next.value;
            temp.next = null;
            tail = temp;
        }
        size--;
        return value;
    }
}

