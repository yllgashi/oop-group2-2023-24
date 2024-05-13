package lecture28_composition_2;

public class Main {
    public static void main(String[] args) {
        // create object of classroom
        Classroom classroom1 = new Classroom();

        // create object of chair
        Chair chair1 = new Chair();

        // initialize attributes of classroom1
        classroom1.setId(1);
        classroom1.setSize(25);
        classroom1.setColor("Red");

        // initialize attributes of chair1
        chair1.setId(105);
        chair1.setMaterial("Wood");
        chair1.setLegsNumber(4);

        // add chair inside classroom
        classroom1.setChairOne(chair1);

        // someone asks: what is the color of classroom
        System.out.println(classroom1.getColor());

        // someone asks: what is the color of chair1 inside classroom
        System.out.println(classroom1.getChairOne().getLegsNumber());
    }
}
