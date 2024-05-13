package lecture29_composition_with_arraylist_3;


import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // create object of classroom
        Classroom classroom1 = new Classroom();

        // create object of chair
        Chair chair1 = new Chair();
        Chair chair2 = new Chair();

        // initialize attributes of classroom1
        classroom1.setId(1);
        classroom1.setSize(25);
        classroom1.setColor("Red");
        ArrayList<Chair> chairs = new ArrayList<>();
        classroom1.setChairs(chairs);

        // initialize attributes of chair1
        chair1.setId(105);
        chair1.setMaterial("Wood");
        chair1.setLegsNumber(4);

        // initialize attributes of chair2
        chair2.setId(106);
        chair2.setMaterial("Wood");
        chair2.setLegsNumber(2);


        // add chair1 inside classroom
        classroom1.addChairIntoClassroom(chair1);
        classroom1.addChairIntoClassroom(chair2);

        // show chairs
        for (int i = 0; i < classroom1.getChairs().size(); i++) {
            System.out.println(classroom1.getChairs().get(i).getId());
            System.out.println(classroom1.getChairs().get(i).getLegsNumber());
            System.out.println(classroom1.getChairs().get(i).getMaterial());
        }
    }
}
