package lecture40_aviary_example_without_inheritance;



/*
    NOT RECOMMENDED WITHOUT INHERITANCE
 */
public class Main {
    public static void main(String[] args) {
        // THIS IS NOT RECOMMENDED, because:
        // 1. For each time we have a new bird type we need to add an element to BirdType enum
        // 2. For each time we have a new bird type we need to change "case" statement in Bird class
        // 3. Less structured application


        Bird flyingBird = new Bird();
        flyingBird.setId(1);
        flyingBird.setCall("fBird");
        flyingBird.setColor("white");
        flyingBird.setType(BirdType.FLYING_BIRD);
        flyingBird.move();

        Bird walkingBird = new Bird();
        walkingBird.setId(2);
        walkingBird.setCall("wBird");
        walkingBird.setColor("white");
        walkingBird.setType(BirdType.WALKING_BIRD);
        walkingBird.move();
    }
}
