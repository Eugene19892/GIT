package Lesson5;

import Lesson5.models.Hero;

public class Archer extends Hero {

    protected int speed;


    public Archer(String name, int health, int power, int attack, int defense) {
        super(name, health, power, attack, defense);

    }

    public Archer(String name, int health, int power, int attack, int defense, int speed) {
        super(name, health, power, attack, defense);
        this.speed = speed;
    }

    @Override
    public void sleep() {

        System.out.println(" Стрелок Спит ");
        System.out.println(" ------- ");
    }
}