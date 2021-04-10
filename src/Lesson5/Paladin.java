package Lesson5;

import Lesson5.models.Hero;

public class Paladin extends Hero {



    public Paladin(String name, int health, int power, int attack, int defense) {
    super(name,  health,  power,  attack,  defense);

    }

    @Override
    public void sleep() {

        System.out.println(" Рыцарь Спит ");
        System.out.println(" -------- ");
    }

    public void  defense() {

        System.out.println(this.name + " Я защитился " + this.defence);

}


    }

