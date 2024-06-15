package lecture67_generics_classes;

public class Main {
    public static void main(String[] args) {
        PairOne<Integer> pairInteger = new PairOne<Integer>(1, 10);
        PairOne<Double> pairDouble = new PairOne<Double>(1.10, 2.20);
        PairOne<Boolean> pairBoolean = new PairOne<Boolean>(false, true);


        PairTwo<Integer, Boolean> pairTwo = new PairTwo<Integer, Boolean>(1, false);
    }
}
