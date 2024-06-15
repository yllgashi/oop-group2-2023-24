package lecture56_interfaces_2;

class Main {
    public static void main(String[] args) {
        Attacker attacker = new Attacker(1, "Leonel", "Messi");
        Goalkeeper goalkeeper = new Goalkeeper(2, "Manuel", "Neuer");


        attacker.getId(); // inherited from parent class
        attacker.getFirstName(); // inherited from parent class
        attacker.play(); // inherited from Player interface
        attacker.move(); // inherited from Player interface
        attacker.score(); // inherited from Player interface


        goalkeeper.getId(); // inherited from parent class
        goalkeeper.getFirstName(); // inherited from parent class
        goalkeeper.play(); // inherited from Player interface
        goalkeeper.move(); // inherited from Player interface
        goalkeeper.score(); // inherited from Player interface




        Person person = attacker;
        person.getId(); // only methods and attributes which are from parent
        // ...

        Player player = attacker;
        player.play(); // only methods which are from interface
    }
}
