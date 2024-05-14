package lecture31_composition_hotel_management_system;

class Room {
    private int id;
    private int floor;
    private int number;
    private double size;
    private RoomType roomType;
    private Visitor currentVisitor;

    public Room(int id, int floor, int number, double size, RoomType roomType) {
        this.setId(id);
        this.setFloor(floor);
        this.setNumber(number);
        this.setSize(size);
        this.setRoomType(roomType);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Visitor getCurrentVisitor() {
        return currentVisitor;
    }

    public void setCurrentVisitor(Visitor currentVisitor) {
        this.currentVisitor = currentVisitor;
    }
}