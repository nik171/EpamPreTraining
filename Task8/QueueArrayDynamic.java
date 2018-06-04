package by.epam.preTraining.FilatovNI.tasks.task08.model;

import java.util.EmptyStackException;

public class QueueArrayDynamic<E> {
    protected static final int MAX_CAPACITY = Integer.MAX_VALUE - 8;
    protected static final int DEFAULT_CAPACITY = 10;

    protected Object[] array;
    protected int begin = -1;
    protected int end = -1;

    public QueueArrayDynamic() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public QueueArrayDynamic(int initialCapacity) {
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
        if (isFull()) {
            throw new OutOfMemoryError();
        }
        if (end == array.length - 1) {
            if (begin == 0) {
                realloc();
            }
            shift();
        }
        array[++end] = e;
    }

    public boolean isFull() {
        return size() == MAX_CAPACITY;
    }

    public static Object[] reallocate(Object[] array, int length, int maxCapacity) {
        long greaterSize = Math.round(array.length * 1.5);
        if (greaterSize > maxCapacity) {
            greaterSize = maxCapacity;
        }
        Object[] greaterArray = new Object[(int) greaterSize];
        System.arraycopy(array, 0, greaterArray, 0, length);
        return greaterArray;
    }

    private void realloc() {
        array = reallocate(array, array.length, MAX_CAPACITY);
    }
}
