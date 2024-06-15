package lecture60_interfaces_y8_games;

public class FootballGame extends Game implements GameRules {

    @Override
    public boolean isLegal(String operation) {
        return false;
    }

    @Override
    public boolean isCompetitive() {
        return true;
    }
}
