package lecture36_inheritance_super_keyword;

class Player extends Person {
    private String firstName;

    // use "super" keyword to call parent's attributes, methods, constructor, etc
    public Player(int id, String firstName, String position) {
        super(id, firstName); // call parent constructor
        super.test = "abc"; // call parent attribute
        super.firstName = "Filan"; // call parent attribute
        super.sayHello(); // call parent method
    }
}
