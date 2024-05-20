package lecture33_football_league;

import java.time.LocalDate;
import java.util.ArrayList;

class Club {
    private int id;
    private String name;
    private LocalDate createDate;
    private Manager manager;
    private Trainer trainer;

    private ArrayList<Player> players;

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

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void addPlayer(Player player) {
        if (this.getPlayers() != null) {
            this.players.add(player);
        }
    }
}