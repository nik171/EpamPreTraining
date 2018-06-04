package by.epam.preTraining.FilatovNI.tasks.task08.model;

public class StackArrayDynamic<E> {
    protected static final int DEFAULT_CAPACITY = 10;
    protected static final int MAX_CAPACITY = Integer.MAX_VALUE - 8;

    protected Object[] array;
    protected int pointer = -1;

    public StackArrayDynamic() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public StackArrayDynamic(int initialCapacity) {
        if (initialCapacity <= 0 || initialCapacity > MAX_CAPACITY) {
            throw new IllegalArgumentException();
        }
        array = new Object[initialCapacity];
    }

    public E peek() {
        if (!isEmpty()) {
            return (E)array[pointer];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public E pop() {
        E value = peek();
        array[pointer--] = null;
        return value;
    }

    public int size() {
        return pointer + 1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void push(E e) {
        if (isFull()) {
            throw new OutOfMemoryError();
        }
        if (pointer == array.length - 1) {
            realloc();
        }
        array[++pointer] = e;
    }

    public boolean isFull() {
        return pointer == MAX_CAPACITY - 1;
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

    public static void shiftLeft(Object[] array, int position) {
        System.arraycopy(array, position, array, 0, array.length - position);
    }

    private void realloc() {
        array = reallocate(array, array.length, MAX_CAPACITY);
    }
}
