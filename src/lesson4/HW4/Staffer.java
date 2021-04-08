package lesson4.HW4;

public class Staffer {
    String questionnaire;
    String name;
    String post;
    String phone_number;
    int salary;
    int age;

    public Staffer(String questionnaire,  String name,  String post,
                   String phone_number, int salary, int age) {
        this.questionnaire = questionnaire;
        this.name = name;
        this.post = post;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;

    }



    public void print(){
        System.out.println("Анкета " + this.questionnaire + " | ФИО = " + this.name
                + " | Возраст = " + this.age);}

    public String getQuestionnaire() {
        return questionnaire;

    }
    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;


//
//  @Override
//  public String toString() {
//    return String.format("Анкета: %s \tФамилия: %s \nИмя: %s " +
//                    "\t Отчество: %s \n Должность: %s " +
//                    "\t Номер телефона: %s \nЗарплата: %d \tВозраст: %d \n",
//            questionnaire, lastname, name, patronymic, post, phone_number, salary, age);


    }


}
