package Collections;
import java.util.Iterator;
public interface List<T> {
    int size();
    void add(T elem);
    T get(int index);
    boolean isEmpty();
    void set(int index, T elem);
    int indexOf(T elem);
    void clear();

    Iterator<T> iterator();
}
