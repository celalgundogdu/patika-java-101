package classes.practise2;

import java.util.Random;

public class Match {

    Fighter fighter1;
    Fighter fighter2;
    int minWeight;
    int maxWeight;

    Match(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if (isValidWeight()){
            if (findFirstPunch().equals(fighter1)) {
                while (fighter1.health > 0 && fighter2.health > 0) {
                    System.out.println("============================");
                    this.fighter2.health = this.fighter1.hit(this.fighter2);
                    if (isWin()) {
                        break;
                    }
                    this.fighter1.health = this.fighter2.hit(this.fighter1);
                    if (isWin()) {
                        break;
                    }
                    this.fighter1.printHealth();
                    this.fighter2.printHealth();
                }
            } else {
                while (fighter1.health > 0 && fighter2.health > 0) {
                    System.out.println("============================");
                    this.fighter1.health = this.fighter2.hit(this.fighter1);
                    if (isWin()) {
                        break;
                    }
                    this.fighter2.health = this.fighter1.hit(this.fighter2);
                    if (isWin()) {
                        break;
                    }
                    this.fighter1.printHealth();
                    this.fighter2.printHealth();
                }
            }
        } else {
            System.out.println("Sporcuların sikletleri aynı degil!");
        }
    }

    Fighter findFirstPunch(){
        Random rnd = new Random();
        int number = rnd.nextInt(100);
        if (number < 50){
            return fighter1;
        }
        return fighter2;
    }

    boolean isWin(){
        if (this.fighter1.health == 0){
            System.out.println(fighter2.name + " kazandı");
            return true;
        }
        if (this.fighter2.health == 0){
            System.out.println(fighter1.name + " kazandı");
            return true;
        }
        return false;
    }

    boolean isValidWeight(){
        return (this.fighter1.weight >= minWeight && this.fighter1.weight <= maxWeight) &&
                (this.fighter2.weight >= minWeight && this.fighter2.weight <= maxWeight);
    }

}
