package lecture45_polymorphism_1;

public class AlbaniaBank extends Bank {
    public AlbaniaBank(int id, String name, int createYear) {
        super(id, name, createYear);
    }

    @Override
    public double getRateOfInterest() {
        return (double) 10 / 100;
    }
}
