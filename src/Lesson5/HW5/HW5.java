package Lesson5.HW5;

public class HW5 {


    public static void main(String[] args) {


        Кот cat = new Кот("Барсик", 200, 0, 2);
        Лошадь horse = new Лошадь("Ястреб", 1500, 100, 3);
        Птица birds = new Птица("Кеша", 5, 0, 0.2);
        Собака dog = new Собака("Пушок", 500, 10, 0.5);


        cat.catInfo();
        System.out.printf("%s Барсик пробежал или нет: %s\n",
                cat.getClass().getSimpleName(),
                cat.бег(20));
        System.out.println(" Барсик пробежал ");
        System.out.printf("%s Барсик проплыл или нет : %s\n",
                cat.getClass().getSimpleName(),
                cat.плавание(20));
        System.out.println(" Барсик не умеет плавать ");
        System.out.printf("%s Барсик прыгнул или нет : %s\n",
                cat.getClass().getSimpleName(),
                cat.прыжок(2));
        System.out.println(" Барсик прыгнул ");
        System.out.println("---------------");

        horse.horseInfo();
        System.out.printf("%s Ястреб пробежал или нет: %s\n",
                horse.getClass().getSimpleName(),
                horse.бег(1000));
        System.out.println("Лошадь пробежала");
        System.out.printf("%s Ястреб проплыл или нет : %s\n",
                horse.getClass().getSimpleName(),
                horse.плавание(50));
        System.out.println("Лошадь проплыла");
        System.out.printf("%s Ястреб проплыл или нет : %s\n",
                horse.getClass().getSimpleName(),
                horse.прыжок(50));
        System.out.println("Ястреб совершил прыжок");
        System.out.println("---------------");



        birds.birdsInfo();
        System.out.printf("%s Кеша пробежал или нет: %s\n",
                birds.getClass().getSimpleName(),
                birds.бег(50));
        System.out.println("Кеша не пробежал");
        System.out.printf("%s Кеша проплыл или нет : %s\n",
                birds.getClass().getSimpleName(),
                birds.плавание(10));
        System.out.println("Кеша не проплыл");
        System.out.printf("%s Кеша проплыл или нет : %s\n",
                birds.getClass().getSimpleName(),
                birds.прыжок(5));
        System.out.println("Кеша не прыгнул");
        System.out.println("---------------");

        dog.dogInfo();
        System.out.printf("%s Пушок пробежал или нет: %s\n",
                dog.getClass().getSimpleName(),
                dog.бег(1000));
        System.out.println("Пушок не пробежал");
        System.out.printf("%s Пушок проплыл или нет : %s\n",
                dog.getClass().getSimpleName(),
                dog.плавание(5));
        System.out.println("Пушок проплыл");
        System.out.printf("%s Пушок проплыл или нет : %s\n",
                birds.getClass().getSimpleName(),
                birds.прыжок(5));
        System.out.println("Пушок не прыгнул");





    }}