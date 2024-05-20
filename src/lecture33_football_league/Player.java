package lecture33_football_league;

class Player extends Person {
    private PlayerPosition position;
    
    public PlayerPosition getPosition() {
        return position;
    }

    public void setPosition(PlayerPosition position) {
        this.position = position;
    }
}
