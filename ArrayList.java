package Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<T> implements List<T>{
    int size;
    final int defaultСapacity = 10;
    int capacity;
    Object [] array ;
    int curr;

    public ArrayList() {
        this.size = 0;
        curr = 0;
        this.capacity = defaultСapacity;
        this.array = new Object [defaultСapacity];

    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        return  (T)array[index];

    }

    @Override
    public void add(T elem) {
        if (size == capacity){
            extension();
        }
        array[size] =  elem;
        size++;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void set(int index, T elem) {
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        if (size == capacity){
            extension();
        }
        array[index] = elem;
        size++;
    }

    @Override
    public int indexOf(T elem) {
        for(int i = 0; i < size; i++){
            if(array[i]== elem){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        for(int i = 0; i < size; i++){
            array[i] = 0;
        }
        size = 0;


    }
    public void extension(){
        capacity = capacity * 2;
        Object [] newArray = new Object[capacity];
        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }
    @Override
    public Iterator<T> iterator() {
        return new Iter();

    }
    public class Iter implements Iterator<T> {
        public int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return (T)array[currentIndex++];
        }
    }
}


