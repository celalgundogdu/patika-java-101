package classes.practise2;

public class Main {

    public static void main(String[] args) {

        Fighter fighter1 = new Fighter("ABC",10, 120, 100, 70);
        Fighter fighter2 = new Fighter("DEF", 20, 85, 95, 50);

        Match match = new Match(fighter1, fighter2, 95, 100);
        match.run();

    }

}
