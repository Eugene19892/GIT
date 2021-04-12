package Lesson5.HW5;

import Lesson5.HW5.models.Животное;

public class Лошадь extends Животное {

    public Лошадь(String имя, double бег, double плавание, double прыжок) {
        super(имя, бег, плавание, прыжок);
    }
    public void horseInfo () {
        System.out.println("HorseName: " + имя + " /RunLimit: " + бег + " meters/"
                + " /Sweem:" + плавание + " /Jump: " + прыжок + " meters/");
    }




    @Override
    public boolean бег(double бег) {
        return (бег > 0 && бег <= 1500);
    }

    @Override
    public boolean прыжок(double прыжок) {
        return (прыжок > 0 && прыжок <= 3);
    }
    @Override
    public boolean плавание(double плавание) {
        return (плавание > 0 && плавание < 100);

    }

}
