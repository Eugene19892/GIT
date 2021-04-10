package Lesson5;

public final class  Titan extends Paladin{

    public Titan (String name, int health, int power, int attack, int defense){
        super(name, health, power, attack, defense);



    }
@Override
    public  void healthSelf(){

        System.out.println(this.name + " Запрещено лечение ");



}
@Override
    public void sleep() {

        System.out.println(" Титан не спит ");
    System.out.println(" ------- ");
    }
}
