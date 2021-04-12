package Lesson5.HW5;


import geekbrains.lesson5.models.Животное;

public class Собака extends Животное {

    public Собака(String имя, double бег, double плавание, double прыжок) {
        super(имя, бег, плавание, прыжок);

    }
    public void dogInfo () {
        System.out.println("DogName: " + имя + " /RunLimit: " + бег + " meters/"
                + " /Sweem:" + плавание + " /Jump: " + прыжок + " meters/");


    }


    @Override
    public boolean бег(double бег) {
        return (бег > 0 && бег <= 500);
    }

    @Override
    public boolean прыжок(double прыжок) {
        return (прыжок > 0 && прыжок <= 0.5);
    }

    @Override
    public boolean  плавание(double плавание) {
        return (плавание > 0 && плавание < 10);
    }
}
