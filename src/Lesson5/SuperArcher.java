package Lesson5;

public class SuperArcher extends Archer {

    public SuperArcher(String name, int health, int power, int attack, int defense, int speed) {
        super(name,  health,  power,  attack,  defense, speed);



}
public void SuperAttack(){
        System.out.println(name + " Супер атака " + this.attack * this.speed);
    System.out.println(" ------- ");
}

}
