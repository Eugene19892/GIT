package Lesson5;

import Lesson5.models.Hero;

public class Lesson5 {

    public static void main(String[] args) {


        Paladin paladin = new Paladin("Paladin", 100, 50, 400, 100);
        Archer archer = new Archer("Archer", 80, 100, 50, 10);
        Mag mag = new Mag("Mag", 50, 120, 100, 0);
        Titan titan = new Titan("Titan", 500, 220, 700, 900);
        SuperArcher superarcher = new SuperArcher("SuperArcher", 80, 100, 50, 10, 999);

//paladin.speak();
//paladin.dealDamage();
//paladin.healthSelf();
//paladin.defense();
//paladin.sleep();
//System.out.println("---------");
//titan.defense();
//titan.healthSelf();
//titan.sleep();
//        System.out.println("---------");
//        archer.speak();
//        archer.dealDamage();
//        archer.healthSelf();
//        System.out.println("---------");
//        superarcher.SuperAttack();
//        System.out.println("---------");
//
//        mag.speak();
//       mag.dealDamage();
//        mag.healthSelf();

//        Hero[] army = {paladin,titan,archer,superarcher,mag};
//        for (int i = 0; i < army.length; i++){
//army[i].speak();
//army[i].dealDamage();
//army[i].healthSelf();
//army[i].sleep();
//if (army[i] instanceof SuperArcher){
//    ((SuperArcher) army[i]).SuperAttack();
//}
//    }

    Object[] myArray = new Object[4];
    int a = 10;
    String myString = "Hello";
    char b = 'H';
    myArray[0] = a;
    myArray[1] = myString;
    myArray[2] = b;
    myArray[3] = paladin;



    }

}
