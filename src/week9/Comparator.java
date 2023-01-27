package week9;

public interface Comparator<T> {
    //return true if a comes before b and false otherwise
    boolean compare(T a, T b);
}
