package Lesson5.HW5.models;

public abstract class Животное {

    protected String имя;
    protected double бег;
    protected double плавание;
    protected double прыжок;


    public Животное(String имя, double бег, double плавание, double прыжок) {
        this.бег = бег;
        this.плавание = плавание;
        this.прыжок = прыжок;
    }

    public void speak() {
        System.out.println(бег + " says Hello guys ");
    }

    public static void animalInfo() {
        System.out.println();
    }


    public abstract boolean бег(double бег);




    public abstract boolean прыжок(double прыжок);


    public abstract boolean плавание(double плавание);
}