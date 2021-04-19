package lesson01;

public class HW1 {

//метод 1
   public static void main(String[] args){

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        float result;

        result = a * (b + (c / d));

        result = calculate(a, b, c, d);

        System.out.println(result);


    }

    public static float calculate(int valueA, int valueB, int valueC, int valueD) {
        return valueA * (valueB + ((float)valueC / valueD));


    }



//    метод 2
//    static boolean myMath(int a, int b) {
//
//        int sum = a + b;
//        if (sum >= 10 && sum <= 20) return true;
//        else return false;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(myMath(1, 15));
//    }
//}

//метод 3
    public static void main1(String[] args) {

        int a = 3, b = 3, c = 0;

        c = a - b; // с = 3 - 3 = 0
        System.out.println("с = " + c);
        if (c >= 0) {
            System.out.println("с не отрицательно");
        }
        if (c < 0) {

        }
    }
}


//метод 4

//public static void main(String[] args) {
//
//    doSomething1();
//}
//public static void doSomething1() {
//        System.out.println("Hello, Eugene");
//    }
//



//}



