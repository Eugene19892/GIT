package Lesson5;

import Lesson5.models.Hero;

public class Mag extends Hero {



    public Mag(String name, int health, int power, int attack, int defense) {
        super(name,  health,  power,  attack,  defense);

    }
@Override
    public void speak(){
        super.speak();

    System.out.println(name + " says Hello Archer ");

}

    @Override
    public void sleep() {

        System.out.println(" Маг Спит ");
}}





