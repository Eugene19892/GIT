package lesson4.HW4;

public class HW4 {
    public static void main(String[] args)  {
        Staffer[] staffer = new Staffer[5];
        staffer[0] = new Staffer("1", "Колобков Борис Юрьевич", "Менеджер",
                "9067842639", 80000, 30);
        staffer[1] = new Staffer("2","Мюсликов Станислав Борисович", "Ведущий инженер", "9265667834",
                100000, 60);
        staffer[2] = new Staffer("3","Лопаткин Артем Григорьевич", "кладовщик", "9159059874",
                30000, 25);
        staffer[3] = new Staffer("4","Грибоедов Вячеслав Леонидович", "Руководитель ОП", "9299775656",
                200000, 48);
        staffer[4] = new Staffer("5","Блинов Владимир Артурович", "частный водитель", "9267089010",
                70000, 41);

        System.out.println(" Анкета номер = " + staffer[0].getQuestionnaire() +  " | ФИО = "
                + staffer[0].getName()  + " | Должность = " + staffer[0].getPost() + " | Номер телефона = " + staffer[0].getPhone_number() +
                " | Зарплата = " + staffer[0].getSalary() + " | Возраст = " + staffer[0].getAge());
        System.out.println(" Анкета номер = " + staffer[1].getQuestionnaire() +  " | ФИО = "
                + staffer[1].getName()  + " | Должность = " + staffer[1].getPost() + " | Номер телефона = " + staffer[1].getPhone_number() +
                " | Зарплата = " + staffer[1].getSalary() + " | Возраст = " + staffer[1].getAge());
        System.out.println(" Анкета номер = " + staffer[2].getQuestionnaire() +  " | ФИО = "
                + staffer[2].getName()  + " | Должность = " + staffer[2].getPost() + " | Номер телефона = " + staffer[2].getPhone_number() +
                " | Зарплата = " + staffer[2].getSalary() + " | Возраст = " + staffer[2].getAge());
        System.out.println(" Анкета номер = " + staffer[3].getQuestionnaire() +  " | ФИО = "
                + staffer[3].getName()  + " | Должность = " + staffer[3].getPost() + " | Номер телефона = " + staffer[3].getPhone_number() +
                " | Зарплата = " + staffer[3].getSalary() + " | Возраст = " + staffer[3].getAge());
        System.out.println(" Анкета номер = " + staffer[4].getQuestionnaire() +  " | ФИО = "
                + staffer[4].getName()  + " | Должность = " + staffer[4].getPost() + " | Номер телефона = " + staffer[4].getPhone_number() +
                " | Зарплата = " + staffer[4].getSalary() + " | Возраст = " + staffer[4].getAge());


        for (int i=0; i < staffer.length; i++)
            if (staffer[i].age > 40) staffer[i].print();


    }}
