package lecture34_interitance_constructors;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Filan1", "Fisteku1");
        Player player1 = new Player(2, "Filan2", "Fisteku2", "Attacker");
        Coach coach1 = new Coach(3, "Filan3", "Fisteku3", "Long story...");


        System.out.println(person1.getId());
        System.out.println(player1.getId());
        System.out.println(coach1.getId());
    }
}
