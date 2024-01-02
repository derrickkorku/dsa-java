import java.util.Arrays;

/**
 * Implement Custom ArrayList in Java
 */
public class CustomArrayList<T> {
    private static final int DEFAULT_SIZE = 2;
    private static int size = 0;
    private Object[] elements;

    CustomArrayList() {
        elements = new Object[DEFAULT_SIZE];
    }

    public void add(Object d) {
        if (size == elements.length) {
            increaseSize();
        }

        elements[size] = d;
        size++;
    }

    public Object get(int i) {
        if (i >= size || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return elements[i];
    }

    private void increaseSize() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public static int size() {
        return size;
    }
}
