package lecture60_interfaces_y8_games;

public class BarbieGame extends Game implements GameRules {
    @Override
    public boolean isLegal(String operation) {
        return true;
    }

    @Override
    public boolean isCompetitive() {
        return false;
    }
}
