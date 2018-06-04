package by.epam.preTraining.FilatovNI.tasks.task08.model;

import java.util.EmptyStackException;

public class QueueArrayStatic<E> {
    protected static final int MAX_CAPACITY = Integer.MAX_VALUE - 8;
    protected static final int DEFAULT_CAPACITY = 10;

    protected Object[] array;
    protected int begin = -1;
    protected int end = -1;

    public QueueArrayStatic() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public QueueArrayStatic(int initialCapacity) {
        if (initialCapacity <= 0 || initialCapacity > MAX_CAPACITY) {
            throw new IllegalArgumentException();
        }
        array = new Object[initialCapacity];
    }

    public E dequeue() {
        if (!isEmpty()) {
            return  (E) array[begin++];
        } else {
            throw new EmptyStackException();
        }
    }

    public E peek() {
        if (!isEmpty()) {
            return  (E) array[begin];
        } else {
            throw new EmptyStackException();
        }
    }

    public int size() {
        return end - begin;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public static void shiftLeft(Object[] array, int position) {
        System.arraycopy(array, position, array, 0, array.length - position);
    }

    protected void shift() {
        shiftLeft(array, begin);
        end = end - begin;
        begin = 0;
    }

    public void enqueue(E e) {
        if (end == array.length - 1) {
            if (begin == 0) {
                throw new OutOfMemoryError();
            }
            shift();
        }
        array[++end] = e;
    }

    public boolean isFull() {
        return begin == 0 && end == array.length - 1;
    }
}
