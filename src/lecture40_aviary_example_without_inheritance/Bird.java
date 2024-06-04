package lecture40_aviary_example_without_inheritance;

class Bird {
    private int id;
    private String call;
    private String color;
    private String food;
    private BirdType type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public BirdType getType() {
        return type;
    }

    public void setType(BirdType type) {
        this.type = type;
    }

    public void move() {
        switch (type) {
            case FLYING_BIRD -> System.out.println("Flying...");
            case WALKING_BIRD -> System.out.println("Walking...");
        }
    }
}
