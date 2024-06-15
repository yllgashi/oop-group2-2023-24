package lecture53_abstract_classes_2;

import java.util.ArrayList;

public class GameExample {
    public static void main(String[] args) {
        Goalkeeper goalkeeper = new Goalkeeper();
        goalkeeper.setFirstName("Filan1");

        Defender defender = new Defender();
        defender.setFirstName("Filan2");

        Coach coach = new Coach();
        coach.setFirstName("Filan3");

        Manager manager = new Manager();
        manager.setFirstName("Filan4");

        goalkeeper.play();
        defender.play();
        coach.play();
        manager.play();
        coach.train();

        ArrayList<Person> people = new ArrayList<>();
        people.add(goalkeeper);
        people.add(defender);
        people.add(coach);
        people.add(manager);


        for (int i = 0; i < people.size(); i++) {
            people.get(i).play();
        }
    }
}
