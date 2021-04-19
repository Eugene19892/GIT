package Lesson6.HW6;

public class Lesson06 extends Object {

    //    private static Scanner scanner = new Scanner(System.in);
    private static int round = 1;




    public static void main(String[] args) throws InterruptedException {

        LightHero lightHero = new LightHero("LightHero", 10, 100, 20);
        DarkHero darkHero = new DarkHero("DarkHero", 10, 150, 5);
        Hero Hero = new Hero("Hero", 5, 150, 2);

        while (!lightHero.isDead() || !darkHero.isDead() || !Hero.isDead()) {
            System.out.println("**** Round " + round + " ****");

            System.out.println(lightHero.getHeroInfo());
            System.out.println(darkHero.getHeroInfo());
            System.out.println(Hero.getHeroInfo());

            lightHero.attack(darkHero);

            if (darkHero.isDead()) {
                System.out.println("lightHero win");
                break;
            }

            darkHero.attack(lightHero);

            if (lightHero.isDead()) {
                System.out.println("darkHero win");
                break;
            }

            Hero.attack(darkHero);

            if (darkHero.isDead()) {
                System.out.println("Hero win");
                break;
            }

            lightHero.attack(Hero);

            if (Hero.isDead()) {
                System.out.println("lightHero win");
                break;
            }

            darkHero.attack(Hero);

            if (Hero.isDead()) {
                System.out.println("darkHero win");
                break;
            }

            lightHero.healSelf();
            darkHero.healSelf();
            Hero.healSelf();

            System.out.println(lightHero.getHeroInfo());
            System.out.println(darkHero.getHeroInfo());
            System.out.println(Hero.getHeroInfo());
            round++;

            Thread.sleep(3000);
        }



    }
}