package classes.practise2;

public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int block;

    Fighter(String name, int damage, int health, int weight, int block){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (block >= 0 && block <= 100){
            this.block = block;
        } else {
            this.block = 0;
        }
    }

    int hit(Fighter opponent){
        System.out.println(this.name + "  => " + opponent.name + " " + this.damage + " hasar verdi.");
        if (opponent.isBlock()){
            System.out.println(opponent.name + " hasarı blokladı");
            return opponent.health;
        }
        if (opponent.health - this.damage < 0){
            return 0;
        }
        return opponent.health - this.damage;
    }

    boolean isBlock(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.block;
    }

    void printHealth(){
        System.out.println(this.name + " Sağlık: " + this.health);
    }

}
