package lecture53_abstract_classes_2;

class Coach extends Person {
    @Override
    public void play() {
        System.out.println("I am standing outside field...");
    }

    public void train() {
        System.out.println("I am training");
    }
}
