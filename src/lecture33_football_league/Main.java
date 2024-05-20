package lecture33_football_league;

import java.util.ArrayList;


//- Nderto sistemin qe do te merret me menaxhimin e liges
//        se futbollit te Kosoves.
//        - Sistemi do te permbaj klubet futbollisitke
//        - Sistemi do te permbaj te dhena per lojtaret, trajneret, etj
//        - Sistemi do te permbaj te dhena per ndeshjet qe do
//        te zhvillohen
//        - Sistemi do te permbaj te dhena per te gjitha
//        stadionet e liges
//
//
//        --- Zbulo entitetet qe do te i permbaj aplikacioni:
//        LigaFutbollit
//        Lojtari
//        Traineri
//        MenaxheriEkipit
//        Klubi
//        Ndeshja
//        Stadioni

public class Main {
    public static void main(String[] args) {
        Player leoMessi = new Player();
        leoMessi.setId(1);
        leoMessi.setFirstName("Leonel");
        leoMessi.setLastName("Messi");
        leoMessi.setPosition(PlayerPosition.ATTACK);

        Player cRonaldo = new Player();
        cRonaldo.setId(2);
        cRonaldo.setFirstName("Cristiano");
        cRonaldo.setLastName("Ronaldo");
        cRonaldo.setPosition(PlayerPosition.ATTACK);

        Trainer t1 = new Trainer();
        t1.setId(3);
        t1.setFirstName("Filan");
        t1.setLastName("Fisteku");

        Trainer t2 = new Trainer();
        t2.setId(4);
        t2.setFirstName("Tahir");
        t2.setLastName("Batatina");

        Club fcBarcelona = new Club();
        fcBarcelona.setId(1);
        fcBarcelona.setName("FC Barcelona");
        fcBarcelona.setPlayers(new ArrayList<>());
        fcBarcelona.addPlayer(leoMessi);
        fcBarcelona.setTrainer(t1);


        Club realMadrid = new Club();
        realMadrid.setId(2);
        realMadrid.setName("Real Madrid");
        realMadrid.setPlayers(new ArrayList<>());
        realMadrid.addPlayer(cRonaldo);
        realMadrid.setTrainer(t2);


        Stadium stadium1 = new Stadium();
        stadium1.setId(1);
        stadium1.setCapacity(10000);
        stadium1.setName("Camp nou");

        Referee referee1 = new Referee();
        referee1.setId(5);
        referee1.setFirstName("Testim");
        referee1.setLastName("Testeri");

        Match match1 = new Match();
        match1.setId(1);
        match1.setClubOne(fcBarcelona);
        match1.setClubTwo(realMadrid);
        match1.setStadium(stadium1);
        match1.setReferee(referee1);

        // result of the match should be 1:2
        match1.addGoalToClubOne();
        match1.addGoalToClubOne();
        match1.addGoalToClubTwo();


        // get result of the match
        match1.getMatchInformation();


        // print players of fcBarcelona
        for (int i = 0; i < fcBarcelona.getPlayers().size(); i++) {
            System.out.println(fcBarcelona.getPlayers().get(i).getFirstName());
        }

        // print players of realMadrid
        for (int i = 0; i < realMadrid.getPlayers().size(); i++) {
            System.out.println(realMadrid.getPlayers().get(i).getFirstName());
        }
    }
}
