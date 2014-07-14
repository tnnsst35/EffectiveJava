/**
 * 廃れたオブジェクト参照を取り除く
 * @author tnnsst35
 */

import java.util.Arrays;

public class Stack {

    private Object[] elements;
    private int      size = 0;
    private static final int DEFAULT_INITIAL_CAPACIRY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACIRY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() throws EmptyStackException {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result  = elements[--size];
        elements[size] = null;  // 廃れた参照を取り除く
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

}
