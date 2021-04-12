package Lesson5.HW5;

import Lesson5.HW5.models.Животное;

public class Птица extends Животное {

    public Птица(String имя, double бег, double плавание, double прыжок) {
        super(имя, бег, плавание, прыжок);
    }

    public void birdsInfo () {
        System.out.println("BirdsName: " + имя + " /RunLimit: " + бег + " meters/"
                + " /Sweem:" + плавание + " /Jump: " + прыжок + " meters/");

    }




    @Override
    public boolean бег(double бег) {
        return (бег > 0 && бег <= 5);
    }

    @Override
    public boolean прыжок(double прыжок) {
        return (прыжок > 0 && прыжок <= 0.2);
    }


    @Override
    public boolean  плавание(double плавание) {
        return false;
    }
}
