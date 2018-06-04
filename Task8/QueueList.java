package by.epam.preTraining.FilatovNI.tasks.task08.model;

import java.util.LinkedList;

public class QueueList<E> {
    private LinkedList<E> list;

    public QueueList() {
        list = new LinkedList<>();
    }

    public void enqueue(E e) {
        list.addLast(e);
    }

    public E dequeue() {
        E value = list.getFirst();
        list.removeFirst();
        return value;
    }

    public E peek() {
        return list.getFirst();
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
