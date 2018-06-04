package by.epam.preTraining.FilatovNI.tasks.task08.model;

public class StackArrayStatic<E> {
    protected static final int DEFAULT_CAPACITY = 10;
    protected static final int MAX_CAPACITY = Integer.MAX_VALUE - 8;

    protected Object[] array;
    protected int head = -1;

    public StackArrayStatic() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public StackArrayStatic(int newCapacity) {
        if (newCapacity <= 0 || newCapacity > MAX_CAPACITY) {
            throw new IllegalArgumentException();
        }
        array = new Object[newCapacity];
    }

    public E peek() {
        if (!isEmpty()) {
            return (E)array[head];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public E pop() {
        E value = peek();
        array[head--] = null;
        return value;
    }

    public int size() {
        return head + 1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void push(E e) {
        if (!isFull()) {
            array[++head] = e;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public boolean isFull() {
        return head == array.length - 1;
    }
}
