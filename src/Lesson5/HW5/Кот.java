package Lesson5.HW5;

import Lesson5.HW5.models.Животное;

public class Кот extends Животное {

    public Кот(String имя, double бег, double плавание, double прыжок) {

        super(имя, бег, плавание, прыжок);
    }


    @Override
    public boolean бег(double бег) {
        return (бег > 0 && бег <= 200);
    }

    @Override
    public boolean прыжок(double прыжок) {
        return (прыжок > 0 && прыжок <= 2);
    }
    @Override
    public boolean плавание(double плавание) {
        return false;
    }



    public void catInfo () {
        System.out.println("CatName: " + имя + " /Растояние бега: " + бег + " meters/"
                + " /Лимит плавания:" + плавание + " /Растояние прыжка: " + прыжок + " meters/");
    }



}