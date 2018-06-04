package by.epam.preTraining.FilatovNI.tasks.task08.model;

import java.util.LinkedList;

public class StackList<E> {
    private LinkedList<E> list;

    public StackList() {
        list = new LinkedList<>();
    }

    public void push(E e) {
        list.addLast(e);
    }

    public E pop() {
        return list.removeLast();
    }

    public E peek() {
        return list.peekLast();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return false;
    }
}
