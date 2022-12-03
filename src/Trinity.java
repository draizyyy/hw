public class Trinity<T extends Comparable<T>> {
    private T first;
    private T second;
    private T third;
    public Trinity(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
        sort();
    }

    public void setFirst(T first) {
        this.first = first;
        sort();
    }

    public void setSecond(T second) {
        this.second = second;
        sort();
    }

    public void setThird(T third) {
        this.third = third;
        sort();
    }
    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    private boolean compare(T t1, T t2) {
        return t1.compareTo(t2) < 0;
    }

    private void sort() {
        T t;
        if (compare(getFirst(), getSecond())) {
            t = getFirst();
            setFirst(getSecond());
            setSecond(t);
        }
        if (compare(getSecond(), getThird())) {
            t = getSecond();
            setSecond(getThird());
            setThird(t);
        }
    }
}