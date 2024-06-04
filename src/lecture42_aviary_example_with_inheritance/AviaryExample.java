package lecture42_aviary_example_with_inheritance;

import java.util.ArrayList;

public class AviaryExample {
    public static void main(String[] args) {
        Bird bird1 = new Bird(1, "red");
        WalkingBird walkingBird1 = new WalkingBird(2, "green");
        FlyingBird flyingBird1 = new FlyingBird(3, "white");
        Owl owl1 = new Owl(4, "blue");

        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(bird1);
        birds.add(walkingBird1);
        birds.add(flyingBird1);
        birds.add(owl1);

        for (int i = 0; i < birds.size(); i++) {
            birds.get(i).talk();
        }
    }
}
