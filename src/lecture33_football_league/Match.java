package lecture33_football_league;

import java.time.LocalDate;

class Match {
    // attributes
    private int id;
    private LocalDate startDate;
    private LocalDate endDate;
    private Referee referee;
    private Stadium stadium;
    private Club clubOne;
    private Club clubTwo;
    private int clubOneGoals;
    private int clubTwoGoals;

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Referee getReferee() {
        return referee;
    }

    public void setReferee(Referee referee) {
        this.referee = referee;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public Club getClubOne() {
        return clubOne;
    }

    public void setClubOne(Club clubOne) {
        this.clubOne = clubOne;
    }

    public Club getClubTwo() {
        return clubTwo;
    }

    public void setClubTwo(Club clubTwo) {
        this.clubTwo = clubTwo;
    }

    public int getClubOneGoals() {
        return clubOneGoals;
    }

    public void setClubOneGoals(int clubOneGoals) {
        this.clubOneGoals = clubOneGoals;
    }

    public int getClubTwoGoals() {
        return clubTwoGoals;
    }

    public void setClubTwoGoals(int clubTwoGoals) {
        this.clubTwoGoals = clubTwoGoals;
    }

    // other methods
    public void addGoalToClubOne() {
        int actualGoals = getClubOneGoals();
        this.setClubOneGoals(actualGoals + 1);
    }

    public void addGoalToClubTwo() {
        int actualGoals = getClubTwoGoals();
        this.setClubTwoGoals(actualGoals + 1);
    }

    public void getMatchInformation() {
        System.out.println("########################");
        System.out.println(this.getClubOne().getName() + " " + this.getClubOneGoals() + ":" + this.getClubTwoGoals() + " " + this.getClubTwo().getName());
        System.out.println("########################");
    }
}
