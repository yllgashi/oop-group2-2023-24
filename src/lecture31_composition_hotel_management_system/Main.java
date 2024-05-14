package lecture31_composition_hotel_management_system;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Hotel hotelKosova = new Hotel(1, "Kosova", 2008);

        Employee employee1 = new Employee(1, "Filan", "Fisteku", 500);
        Employee employee2 = new Employee(2, "Fisnike", "Fisnikja", 200);

        Room room1 = new Room(1, 1, 101, 50, RoomType.SINGLE);
        Room room2 = new Room(2, 1, 102, 100, RoomType.DOUBLE_ROOM);

        Visitor visitor1 = new Visitor(1, "Alush", "Krasniqi", "123", "0123123");


        hotelKosova.addEmployee(employee1);
        hotelKosova.addEmployee(employee2);

        hotelKosova.addRoom(room1);

        hotelKosova.addVisitor(visitor1);

        room1.setCurrentVisitor(visitor1);


        hotelKosova.getRooms().get(0).setCurrentVisitor(visitor1);


        // show hotel info
        System.out.println(hotelKosova.getName());

        // show hotel rooms
        for (int i = 0; i < hotelKosova.getRooms().size(); i++) {
            System.out.println(hotelKosova.getRooms().get(i).getId());
            // ...
        }

        // show all visitors
        for (int i = 0; i < hotelKosova.getVisitors().size(); i++) {
            System.out.println(hotelKosova.getVisitors().get(i).getId());
            // ...
        }

        // show all employees
        for (int i = 0; i < hotelKosova.getEmployees().size(); i++) {
            System.out.println(hotelKosova.getEmployees().get(i).getId());
            // ...
        }

        // show current visitor of room 1 of hotel
        System.out.println(hotelKosova.getRooms().get(0).getCurrentVisitor().getFirstName());
    }
}
