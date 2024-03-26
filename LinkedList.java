package Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class LinkedList<T> implements List<T> {
    Node head;
    int size;

    public LinkedList() {
        this.head = null;

    }

    public class Node {
        T element;
        Node next;

        Node(T element) {
            this.element = element;
            this.next = null;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T elem) {
        Node newNode = new Node(elem);
        Node currentNode = head;
        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    @Override
    public T get(int index) {
        Node current = head;
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void set(int index, T elem) {
        Node current = head;
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.element = elem;
    }

    @Override
    public int indexOf(T elem) {
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.element == elem) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }


    @Override
    public Iterator<T> iterator() {
        return new Iter();
    }

    public class Iter implements Iterator<T> {
        public Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T data = current.element;
            current = current.next;
            return data;
        }
    }
}



