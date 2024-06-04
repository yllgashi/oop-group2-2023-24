package lecture45_polymorphism_1;

class KosovaBank extends Bank {

    public KosovaBank(int id, String name, int createYear) {
        super(id, name, createYear);
    }

    @Override
    public double getRateOfInterest() {
        return (double) 5 / 100;
    }
}
