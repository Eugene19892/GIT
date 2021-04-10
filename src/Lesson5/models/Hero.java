package Lesson5.models;

public abstract class Hero {

    protected String name;
    protected int health;
    protected int power;
    protected int attack;
    protected int defence;

    public Hero(String name, int health, int power, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.attack = attack;
        this.defence = defense;

    }



   public void speak(){
        System.out.println(name + " says Hello guys ");


    }
    public void dealDamage(){
        System.out.println(name + " deal damage " + power * attack);
    }
    public  void healthSelf(){
        health += 20;
        System.out.println(name + " Я повысил здоровье " + health);

    }

public abstract void sleep();


}








