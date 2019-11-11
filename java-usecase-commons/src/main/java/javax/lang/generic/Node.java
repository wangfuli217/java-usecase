package javax.lang.generic;

import java.util.Objects;

public class Node <T> {
    private T data;
    private Node<T> next;

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public Node(T data, Node<T> next) {
        Objects.requireNonNull(data);
        this.data = data;
        this.next = next;
    }
}
