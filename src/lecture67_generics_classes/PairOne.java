package lecture67_generics_classes;

class PairOne<T> {
    private T first;
    private T second;

    public PairOne(T first, T second) {
        this.first = first;
        this.second = second;
    }
}
