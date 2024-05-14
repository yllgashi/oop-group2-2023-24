package lecture31_composition_hotel_management_system;

import java.util.ArrayList;

class Hotel {
    private int id;
    private String name;
    private int year;
    private ArrayList<Employee> employees;
    private ArrayList<Visitor> visitors;
    private ArrayList<Room> rooms;

    public Hotel(int id, String name, int year) {
        this.setId(id);
        this.setName(name);
        this.setYear(year);
        this.setEmployees(new ArrayList<Employee>());
        this.setVisitors(new ArrayList<Visitor>());
        this.setRooms(new ArrayList<Room>());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public void setVisitors(ArrayList<Visitor> visitors) {
        this.visitors = visitors;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }


    public void addVisitor(Visitor visitor) {
        this.visitors.add(visitor);
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }
}