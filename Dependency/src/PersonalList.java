public interface PersonalList {
    int size();
    boolean isEmpty();
    void remove(int index);
    void remove(String index);
    void clear();
    String get(int index);
    void add(String index);
    boolean contains(String index);
    int capacity();
}
