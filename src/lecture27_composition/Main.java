package lecture27_composition;

class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setId(1);
        person1.setFirstName("Filan");
        person1.setLastName("Fisteku");
        Brain brain1 = new Brain();
        brain1.setColor("yellow");
        brain1.setCells(1000);
        brain1.setLifetime(80);
        person1.setBrain(brain1);


        person1.showInformation();
        person1.getBrain().showInformation();
    }
}
