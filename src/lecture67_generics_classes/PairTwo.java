package lecture67_generics_classes;

class PairTwo<T, U> {
    private T first;
    private U second;

    public PairTwo(T first, U second) {
        this.first = first;
        this.second = second;
    }
}
